package co.edu.uniquindio.banco.controllers;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.w3c.dom.ls.LSInput;

import co.edu.uniquindio.banco.exceptions.EmpleadoException;
import co.edu.uniquindio.banco.model.Banco;
import co.edu.uniquindio.banco.model.Cliente;
import co.edu.uniquindio.banco.model.Empleado;
import co.edu.uniquindio.banco.persistence.Persistencia;
import co.edu.uniquindio.banco.services.IModelFactoryService;
import javafx.collections.ObservableList;

public class ModelFactoryController implements IModelFactoryService, Runnable{

	Banco banco;
	Thread hiloServicio1_GuardarResourceXml;
	Thread hiloServicio2_RegistrarLog;
	Thread hiloServicio3_CargarResourceXml;
	BoundedSemaphore semaphore = new BoundedSemaphore(1);
	
	String mensaje;
	int nivel;
	String accion;
	
	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aqu� al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	
	public ModelFactoryController() {
		
		//1. inicializar datos y luego guardarlo en archivos
//		inicializarSalvarDatos();
		
		
		//2. Cargar los datos de los archivos
//		cargarDatosDesdeArchivos();		
		
		//3. Guardar y Cargar el recurso serializable binario		
//		guardarResourceBinario();
//		cargarResourceBinario();

		
		//4. Guardar y Cargar el recurso serializable XML
//		guardarResourceXML();
		cargarResourceXML();
		
		//Siempre se debe verificar si la raiz del recurso es null
		
		if(banco == null){
			banco = new Banco();
//			inicializarDatos();
//			guardarResourceXML();
		}
		
		registrarAccionesSistema("Inicio de sesi�n del usuario Admin", 1, "inicioSesi�n");

	}

	


	private void cargarResourceXML() {
//		hiloServicio3_CargarResourceXml = new Thread(this);
//		hiloServicio3_CargarResourceXml.start();
		banco = Persistencia.cargarRecursoBancoXML();
	}

	private void guardarResourceXML() {
		hiloServicio1_GuardarResourceXml = new Thread(this);
		hiloServicio1_GuardarResourceXml.start();
	}

	private void cargarResourceBinario() {
		banco = Persistencia.cargarRecursoBancoBinario();
	}

	private void guardarResourceBinario() {
		
		Persistencia.guardarRecursoBancoBinario(banco);
		
	}

	private void inicializarSalvarDatos() {
		inicializarDatos();
		try {
			Persistencia.guardarClientes(getBanco().getListaClientes());
			Persistencia.guardarEmpleados(getBanco().getListaEmpleados());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void cargarDatosDesdeArchivos() {
		this.banco = new Banco();
		try {
			ArrayList<Empleado> listaEmpleados =new ArrayList<Empleado>();
			listaEmpleados = Persistencia.cargarEmpleados();
			getBanco().getListaEmpleados().addAll(listaEmpleados);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public void registrarAccionesSistema(String mensaje, int nivel, String accion) {
		this.mensaje = mensaje;
		this.nivel = nivel;
		this.accion = accion;
		hiloServicio2_RegistrarLog = new Thread(this);
		hiloServicio2_RegistrarLog.start();
	}
	
	
	
	private void inicializarDatos() {
		banco = new Banco();
		Cliente cliente = new Cliente();
		cliente.setNombre("juan alberto");
		cliente.setApellido("arias");
		cliente.setCedula("125454");
		cliente.setDireccion("Armenia");
		cliente.setCorreo("uni1@");
		cliente.setFechaNacimiento("12454");
		cliente.setTelefono("125444");
		banco.getListaClientes().add(cliente);

		cliente = new Cliente();
		cliente.setNombre("Pedro");
		cliente.setApellido("Perez");
		cliente.setCedula("77787");
		cliente.setDireccion("Pererira");
		cliente.setCorreo("uni2@");
		cliente.setFechaNacimiento("12454");
		cliente.setTelefono("125444");
		banco.getListaClientes().add(cliente);
		
		cliente = new Cliente();
		cliente.setNombre("Alberto");
		cliente.setApellido("Arias");
		cliente.setCedula("12555");
		cliente.setDireccion("Pererira");
		cliente.setCorreo("uni3@");
		cliente.setFechaNacimiento("12454");
		cliente.setTelefono("125444");
		banco.getListaClientes().add(cliente);
		
		Empleado empleado = new Empleado();
		empleado.setNombre("juan alberto");
		empleado.setApellido("arias");
		empleado.setCedula("125454");
		empleado.setFechaNacimiento("12454");
		banco.getListaEmpleados().add(empleado);
		
		
		empleado = new Empleado();
		empleado.setNombre("Ana 2");
		empleado.setApellido("alzate");
		empleado.setCedula("125454");
		empleado.setFechaNacimiento("12454");
		banco.getListaEmpleados().add(empleado);
		
		empleado = new Empleado();
		empleado.setNombre("Pedro");
		empleado.setApellido("perez");
		empleado.setCedula("125454");
		empleado.setFechaNacimiento("12454");
		banco.getListaEmpleados().add(empleado);
		
		System.out.println("Banco inicializado "+banco );
		
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) {
		Empleado empleado = null;
		try {
			empleado = getBanco().crearEmpleado(nombre, apellido, cedula, fechaNacimiento);
			guardarResourceXML();
			registrarAccionesSistema("Empleado creado con cedula:"+empleado.getCedula(), 1, "crear empleado");
		} catch (EmpleadoException e) {
			// TODO Auto-generated catch block			
			registrarAccionesSistema("ERROR-->"+e.getMessage(), 3, "crear empleado");
		}
		return empleado;
	}

	@Override
	public Boolean eliminarEmpleado(String cedula) {
		boolean flagExiste = false;
		try {
			flagExiste = getBanco().eliminarEmpleado(cedula);
			guardarResourceXML();
			registrarAccionesSistema("Empleado eliminado con cedula:"+cedula, 2, "eliminar empleado");
		} catch (EmpleadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flagExiste;
	}

	@Override
	public Empleado obtenerEmpleado(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Empleado> obtenerEmpleados() {
//		getBanco().getListaEmpleados();
		return getBanco().obtenerEmpleados();
	}

	@Override
	public boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula,
			String fechaNacimiento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run() {
		Thread hiloActual = Thread.currentThread();
		try {
			semaphore.ocupar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(hiloActual == hiloServicio1_GuardarResourceXml){
			Persistencia.guardarRecursoBancoXML(banco);
			liberarSemaforo();
		}
		
		if(hiloActual == hiloServicio2_RegistrarLog){
			Persistencia.guardaRegistroLog(mensaje, nivel, accion);
			liberarSemaforo();
		}
		
//		if(hiloActual == hiloServicio3_CargarResourceXml){
//			banco = Persistencia.cargarRecursoBancoXML();
//			liberarSemaforo();
//		}
		
		
	}

	private void liberarSemaforo() {
		try {
			semaphore.liberar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
