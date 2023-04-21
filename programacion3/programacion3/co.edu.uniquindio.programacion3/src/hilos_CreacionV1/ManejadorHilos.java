package hilos_CreacionV1;

public class ManejadorHilos {

	Hilo_Servicio1 hiloServicio1;
	Hilo_Servicio2 hiloServicio2;
	Hilo_Servicio3 hiloServicio3;
	
	
	
	public ManejadorHilos() {
		
	}
	
	
	public void startHiloServicio1() {
		
		hiloServicio1 = new Hilo_Servicio1(this);
	}


	public void detenerHiloServicio1() {
		
		if(hiloServicio1 != null)
			hiloServicio1.detenerHilo();
	}
	
	
	public void startHiloServicio2() {
		
		hiloServicio2 = new Hilo_Servicio2(this);
	}


	public void detenerHiloServicio2() {
		
		if(hiloServicio2 != null)
			hiloServicio2.detenerHilo();
	}
	
	public void startHiloServicio3() {
		
		hiloServicio3 = new Hilo_Servicio3(this);
	}


	public void detenerHiloServicio3() {
		
		if(hiloServicio3 != null)
			hiloServicio3.detenerHilo();
	}
	
	
}
