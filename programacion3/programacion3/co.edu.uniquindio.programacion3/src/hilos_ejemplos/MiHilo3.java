package hilos_ejemplos;

public class MiHilo3 extends Thread{
	
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ejecución del hilo 3");
		}
	}
}
