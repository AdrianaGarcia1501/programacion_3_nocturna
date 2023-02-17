package co.edu.uniquindio.programacion3.herencia;

public abstract class Vehiculo {
	
	private String nombre;
	private String descripcion;
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public void encender() {
		System.out.println("Encendiendo mi vehiculo");
	}
	
}
