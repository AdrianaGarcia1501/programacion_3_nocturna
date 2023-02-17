package co.edu.uniquindio.programacion3.herencia;

import co.edu.uniquindio.programacion3.interfaces.IVehiculoElectrico;

public class Carro extends Vehiculo implements IVehiculoElectrico{

	@Override
	public void encender() {
		System.out.println("Encendiendo mi carro");
	}

	@Override
	public void encenderMotorElectrico(int voltaje) {
		System.out.println("Iniciar encendido motor electrico");
		System.out.println("Voltaje: "+voltaje);
	}
}
