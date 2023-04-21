package hilos_Join;

public class MainHilos {

	public static void main(String[] args) {
		
		int a,b,c,w = 0;
		
		T1 t1 = new T1(1, 1);
		t1.start();
		
		T2 t2 = new T2(2);
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		a = t1.getA();
		b = t2.getB();
		
		System.out.println("valor de a = " +a);
		System.out.println("valor de b = " +b);
		
		c = a - b;
		System.out.println("valor de c = " +c);
		
		w = c +1;
		
		System.out.println("valor de w = " +w);
		
		

	}

}
