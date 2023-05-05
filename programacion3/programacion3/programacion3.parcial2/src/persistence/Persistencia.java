package persistence;

import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import model.Universidad;


public class Persistencia {

	public static final String RUTA_ARCHIVO_CLIENTES = "src/resources/registroCovid.txt";
	public static final String RUTA_ARCHIVO_MODELO_BANCO_BINARIO = "src/resources/model.dat";
	public static final String RUTA_ARCHIVO_MODELO_BANCO_XML = "src/resources/model.xml";
//	C:\td\persistencia

	
//	
//	public static void cargarDatosArchivos(Banco banco) throws FileNotFoundException, IOException {
//		
//		
//		//cargar archivo de clientes
//		ArrayList<Cliente> clientesCargados = cargarClientes();
//		
//		if(clientesCargados.size() > 0)
//			banco.getListaClientes().addAll(clientesCargados);
//
//		
//		//cargar archivos empleados
//		ArrayList<Empleado> empleadosCargados = cargarEmpleados();
//		
//		if(empleadosCargados.size() > 0)
//			banco.getListaEmpleados().addAll(empleadosCargados);
//		
//		//cargar archivo objetos
//		
//		//cargar archivo empleados
//		
//		//cargar archivo prestamo
//		
//	}
//	
//	
//	
//
//
//
//
//	/**
//	 * Guarda en un archivo de texto todos la información de las personas almacenadas en el ArrayList
//	 * @param objetos
//	 * @param ruta
//	 * @throws IOException
//	 */
//	public static void guardarClientes(ArrayList<Cliente> listaClientes) throws IOException {
//		// TODO Auto-generated method stub
//		String contenido = "";
//		
//		for(Cliente cliente:listaClientes) 
//		{
//			contenido+= cliente.getNombre()+","+cliente.getApellido()+","+cliente.getCedula()+","+cliente.getDireccion()
//		     +","+cliente.getCorreo()+","+cliente.getFechaNacimiento()+","+cliente.getTelefono()+"\n";
//		}
//		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTES, contenido, false);
//		
//	}
	
//	----------------------SAVES------------------------
	
	/**
	 * Guarda en un archivo de texto todos la información de las personas almacenadas en el ArrayList
	 * @param objetos
	 * @param ruta
	 * @throws IOException
	 */
//	
//	public static void guardarObjetos(ArrayList<Cliente> listaClientes, String ruta) throws IOException  {
//		String contenido = "";
//		
//		for(Cliente clienteAux:listaClientes) {
//			contenido+= clienteAux.getNombre()+","+clienteAux.getApellido()+","+clienteAux.getCedula()+clienteAux.getDireccion()
//					     +","+clienteAux.getCorreo()+","+clienteAux.getFechaNacimiento()+","+clienteAux.getTelefono()+"\n";
//		}
//		ArchivoUtil.guardarArchivo(ruta, contenido, true);
//	}


	
	
	
	//------------------------------------SERIALIZACIÓN  y XML
	
	public static void guardarRecursoUniversidadBinario(Universidad universidad) {
		
		try {
			ArchivoUtil.salvarRecursoSerializado(RUTA_ARCHIVO_MODELO_BANCO_BINARIO, universidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void guardarRecursoUniversidadXML(Universidad universidad) {
		
		try {
			ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_BANCO_XML, universidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	
	



}
