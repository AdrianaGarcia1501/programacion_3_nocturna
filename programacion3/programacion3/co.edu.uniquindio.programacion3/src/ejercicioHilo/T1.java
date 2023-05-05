package ejercicioHilo;

public class T1 extends Thread{
	
	private int n;
	private int a;
	
	public T1(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		a = sumaN_Enteros(n);
	}
	
	
	public static int sumaN_Enteros(int n)
	{
		int resultado = 0;
		
		if(n == 1)
		{
			System.out.println("Resultado: "+n);
			return 1;
		}
		else
		{
			resultado = sumaN_Enteros(n-1) + n;
			System.out.println("Resultado: "+resultado);
			return resultado;
		}
		
	}

	public int getA() {
		return a;
	}
	
	

}
