package hilos_Join;

public class T1 extends Thread {

	MainHilos mainHilos;
	int a, x,  y = 0;
	
	public T1( int x, int y) {
//		this.mainHilos = mainHilos;
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public void run() {
		
		a = x + y;
		System.out.println("Resultado s1 a =x+y = "+ a);
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}
	
	
	
	
}
