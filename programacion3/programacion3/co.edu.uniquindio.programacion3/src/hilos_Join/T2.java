package hilos_Join;

public class T2 extends Thread{

	MainHilos mainHilos;
	int b, z= 0;
	
	public T2( int z) {
//		this.mainHilos = mainHilos;
		this.z = z;
	}
	
	
	@Override
	public void run() {
		
		b = z - 1;
		System.out.println("Resultado s2 b = 1-z = "+ b);
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	
	

}
