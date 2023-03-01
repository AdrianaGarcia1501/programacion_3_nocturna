package co.edu.uniquindio.programacion3.recursividad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(retornarNumeroFibonacci());
//		recorrerArreglo();
		int n = 4;
		int resultado = 0;
		resultado = sumarEnteros(n);		
	}
	
	
	

	private static int sumarEnteros(int n) {
		if(n == 1){
			return 1;
		}else{
			return sumarEnteros(n-1)+n;
		}
	}




	private static void recorrerArreglo() {
		System.out.println("Inicio recursividad");
		recorrerArreglo();
	}

	private static String retornarNumeroFibonacci() {
		return "0,1,1,2,3";
	}

}
