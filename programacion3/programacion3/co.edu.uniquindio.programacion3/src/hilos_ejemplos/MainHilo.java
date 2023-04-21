package hilos_ejemplos;

public class MainHilo {

	public static void main(String[] args) {
	
		hilosEjemplo1();
		
	}

	private static void hilosEjemplo1() {
		MiHilo2 miHilo2 = new MiHilo2("Mi hilo 2");
		MiHilo3 miHilo3 = new MiHilo3();
		miHilo2.start();
		miHilo3.start();
		try {
			miHilo2.join();
			miHilo3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Continuación del flujo principal");
	}
	
	
	
	
	
	

}
