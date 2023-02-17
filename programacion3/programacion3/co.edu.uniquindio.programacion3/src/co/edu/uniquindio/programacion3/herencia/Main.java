package co.edu.uniquindio.programacion3.herencia;

public class Main {

	public static void main(String[] args) {
		
		ejemploHerencia();

	}

	private static void ejemploHerencia() {
		Vehiculo vehiculo = new Carro();
		vehiculo.encender();
		Carro carro = new Carro();
		carro.encender();
		carro.encenderMotorElectrico(2000);
		Avion avion = new Avion();
		avion.encender();
	}

}
