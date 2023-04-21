package hilos_Sincronizacion;

public class Main_Sincronizacion {
	
    public static void main(String[] args) {
        int arreglo[]={1,2,3,4,5};
        
        MiHilo mh1 = MiHilo.creaEInicia("#1",arreglo);
        MiHilo mh2 = MiHilo.creaEInicia("#2",arreglo);
        
        

        try {
        	System.out.println("Esperando que los hilos terminen la ejecución");
            mh1.hilo.join();
            mh2.hilo.join();
            System.out.println("Se continua con el flujo principal");
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
    }
}
