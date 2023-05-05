package ejercicioHilo;

public class T3 extends Thread{
	
	private int b;
	private String palabra;
	
	public T3(String palabra) {
		this.palabra= palabra;
	}

	@Override
	public void run() {
		contarConsonantes(palabra);
	}

	private int contarConsonantes(String palabra2) {
		return 13;
		
	}

	public int getB() {
		return b;
	}
	
	

}
