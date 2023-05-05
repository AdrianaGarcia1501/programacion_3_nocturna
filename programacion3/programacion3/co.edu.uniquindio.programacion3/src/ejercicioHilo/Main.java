package ejercicioHilo;

public class Main {

	public static void main(String[] args) {
		
		int enteroSuma = 10;
		String palabra = "electroencefalografista";
		int enteroFactorial = 6;
		int d = 0;
		
		T1 t1 = new T1(10);
		T3 t2 = new T3(palabra);
		T2 t3 = new T2(enteroFactorial);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d = t1.getA() * t2.getB();
		System.out.println("Valor de D = "+d);
		System.out.println("Cantida de consonantes = "+ t3.getC());
	}

}
