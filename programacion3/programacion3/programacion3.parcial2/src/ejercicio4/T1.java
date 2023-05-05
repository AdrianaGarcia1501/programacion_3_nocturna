package ejercicio4;

public class T1 extends Thread{
	
	private int a;
	int [] arreglo;
	
	public T1(int [] arreglo) {
		this.arreglo= arreglo;
	}
	
	@Override
	public void run() {
		a = mostrarArrayRecursivo(arreglo, 0);
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
    public int mostrarArrayRecursivo(int[] array, int indice){
        
        if (indice == (array.length-1)){
        	 System.out.println("Valor en la posición "+indice+" = "+array[indice]);
        }else{
            System.out.println("Valor en la posición "+indice+" = "+array[indice]);
            mostrarArrayRecursivo(array, indice+1);
        }
         
    }
	
	
	

}
