package ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		
		int[] arreglo = {1,2,3,4};
		int[][] matriz ={
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int c = 0;
		
		T1 t1 = new T1(arreglo);
		T2 t2 = new T2(matriz);
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c = t1.getA() * t2.getB();
		System.out.println("Valor de C = "+c);
	}

}
