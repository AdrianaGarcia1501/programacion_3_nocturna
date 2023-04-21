package hilos_CreacionV0;

public class MainEjemplo1 {

	public static void main (String [] args) {
		new MiHilo_1("Pepe").start();
		new MiHilo_1("Juan").start();

		System.out.println("Termina thread main");
	}
}
