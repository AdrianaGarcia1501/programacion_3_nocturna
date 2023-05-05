package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Universidad implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	ArrayList<RegistroCovid> listaCovids = new ArrayList<RegistroCovid>();

	public Universidad() {
	}

	public ArrayList<RegistroCovid> getListaCovids() {
		return listaCovids;
	}

	public void setListaCovids(ArrayList<RegistroCovid> listaCovids) {
		this.listaCovids = listaCovids;
	}
}
