package model;

import java.io.Serializable;

public class RegistroCovid implements Serializable{
	
	//código@nombreComuna@sector@numeroHabitantes@numeroHabitantesConCovid@porcentajeCovid@fechaRegistro
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nombreComuna;
	
	public RegistroCovid() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreComuna() {
		return nombreComuna;
	}

	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
	
	

}
