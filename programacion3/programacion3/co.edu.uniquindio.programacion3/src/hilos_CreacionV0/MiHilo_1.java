package hilos_CreacionV0;

public class MiHilo_1 extends Thread{

	public MiHilo_1(String nombre) {
		super(nombre);
	}


	public void run() {
		for (int i = 0; i < 10 ; i++){
			System.out.println(i + " " + getName());
		}
		System.out.println("Termina thread " + getName());
	}


}
