package hilos_CreacionV2;

public class ManejadorHilos implements Runnable{

//	Hilos propios
	Hilo_Servicio1 hiloServicio1;
	Hilo_Servicio2 hiloServicio2;
	Hilo_Servicio3 hiloServicio3;
	
	
//	Hilos no propios
	Thread hiloServicio4;
	Thread hiloServicio5;

	
	Boolean runHilo = false;
	int valorEntrada;
	int contador = 1;
	long tf = 0;
	long tac = 0;
	
	
	
	
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

	public void startHiloServicio4(Integer valorEntrada) {
		this.valorEntrada = valorEntrada;
		runHilo = true;
		
		hiloServicio4 = new Thread(this);
		hiloServicio4.start();
	}
	
	public void startHiloServicio5() {
		runHilo = true;
		hiloServicio5 = new Thread(this);
		hiloServicio5.start();
	}
	
	

	public void detenerHilo() {
		runHilo = false;
	}


	@Override
	public void run() {
		
		Thread hiloEnEjecucion = Thread.currentThread();
		
		if(hiloEnEjecucion == hiloServicio4)
		{
			while (runHilo) {
				System.out.println("Valor de entrada: "+valorEntrada+" * "+contador+ " = "+ valorEntrada*contador);
				contador++;
				tac = System.currentTimeMillis();
				
				if(contador > 15)
					runHilo = false;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		if(hiloEnEjecucion == hiloServicio5)
		{
			while (runHilo) {
				
				valorEntrada = valorEntrada + valorEntrada;
				System.out.println("Suma por Valor de entrada: "+valorEntrada);
				tac = System.currentTimeMillis();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}




	
	
}
