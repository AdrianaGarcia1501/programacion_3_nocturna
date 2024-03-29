package hilos_ejemplos;

//Crea un hilo implementando Runnable.
//Los objetos de MiHilo se pueden ejecutar en sus propios hilos
// porque MiHilo implementa Runnable.
 class MiHilo2 extends Thread {
    String nombreHilo;
    MiHilo2(String nombre){
        nombreHilo=nombre;
    }
    
    
    //Punto de entrada del hilo
    //Los hilos comienzan a ejecutarse aqu�
    public void run(){
        System.out.println("Comenzando "+nombreHilo);
        try {
            for (int contar=0; contar<10; contar++){
                Thread.sleep(2000);
                System.out.println("En "+nombreHilo+", el recuento "+contar);
            }
        }catch (InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
        System.out.println("Terminando "+nombreHilo);
    }
}
