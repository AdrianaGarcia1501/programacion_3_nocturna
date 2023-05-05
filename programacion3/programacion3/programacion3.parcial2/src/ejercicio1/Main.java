package ejercicio1;

import model.RegistroCovid;
import model.Universidad;
import persistence.Persistencia;

public class Main {

	public static void main(String[] args) {
		Universidad universidad = null;
		
		//1  cargar o armar los datos en codigo
		universidad = inicializarDatos();
		
		//2 xml y bina
		Persistencia.guardarRecursoUniversidadBinario(universidad);
		Persistencia.guardarRecursoUniversidadXML(universidad);
		
		//3
		buscar(universidad);

	}

	private static Universidad inicializarDatos() {
		Universidad universidad = new Universidad();
		
		RegistroCovid registroCovid = new RegistroCovid();
		registroCovid.setCodigo(123);
		registroCovid.setNombreComuna("Armenia");
		universidad.getListaCovids().add(registroCovid);
		
		registroCovid = new RegistroCovid();
		registroCovid.setCodigo(123);
		registroCovid.setNombreComuna("Armenia");
		universidad.getListaCovids().add(registroCovid);
		
		return universidad;
	}

}
