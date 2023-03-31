package co.edu.uniquindio.banco.controllers;

import java.util.ArrayList;

import co.edu.uniquindio.banco.model.Banco;
import co.edu.uniquindio.banco.model.Empleado;
import javafx.collections.ObservableList;

public class CrudEmpleadoViewController {

	ModelFactoryController modelFactoryController;


	public CrudEmpleadoViewController(ModelFactoryController modelFactoryController) {
		this.modelFactoryController = modelFactoryController;
	}
	
	


	public ArrayList<Empleado> obtenerEmpleados() {
		return modelFactoryController.obtenerEmpleados();
	}


	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) {
		return modelFactoryController.crearEmpleado(nombre, apellido, cedula, fechaNacimiento);
	}


	public boolean eliminarEmpleado(String cedula) {
		return modelFactoryController.eliminarEmpleado(cedula);
	}


	public boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula,String fechaNacimiento) {
		return modelFactoryController.actualizarEmpleado(cedulaActual, nombre, apellido, cedula, fechaNacimiento);
	}

}