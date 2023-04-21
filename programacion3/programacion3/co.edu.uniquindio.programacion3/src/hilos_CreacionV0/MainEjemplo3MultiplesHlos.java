package hilos_CreacionV0;

public class MainEjemplo3MultiplesHlos {

	public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");

        MiHilo3 miHilo1 = MiHilo3.crearYComenzar("#1");
        MiHilo3 miHilo2 = MiHilo3.crearYComenzar("#2");
        MiHilo3 miHilo3 = MiHilo3.crearYComenzar("#3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Hilo principal interrumpido.");
            }
        }
        System.out.println("Hilo principal finalizado");
    }
}
