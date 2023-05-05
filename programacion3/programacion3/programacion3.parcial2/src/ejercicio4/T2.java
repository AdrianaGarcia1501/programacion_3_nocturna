package ejercicio4;

public class T2 extends Thread{
	
	private int b;
	int[][] matriz;
	
	
	public T2(int[][] matriz) {
		this.matriz = matriz;
	}
	
	@Override
	public void run() {
		
	}

	public int getB() {
		return b;
	}

	public void setB(int a) {
		this.b = b;
	}
	
	
	
	

}
