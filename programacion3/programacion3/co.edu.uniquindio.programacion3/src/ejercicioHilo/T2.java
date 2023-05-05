package ejercicioHilo;

public class T2 extends Thread{
	
	private int c;
	private int n;
	
	public T2(int enteroFactorial) {
		this.n= enteroFactorial;
	}

	@Override
	public void run() {
		
	}

	public int getC() {
		return c;
	}
	
	

}
