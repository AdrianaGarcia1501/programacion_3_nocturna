package hilos_CarreraAnimales;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class Animal extends Thread {
	String nombre;
	Text text;
	Text textGanador;
	int contador;
	int time;

	public Animal (int prioridad,String nombre, Text textGanador,Text text, int time){
		this.nombre=nombre;
		setPriority(prioridad);
		this.text = text;
		this.textGanador = textGanador;
		this.time = time;
	}


	public void run(){

		for(contador = 1;contador<=10;contador++){
			System.out.print(contador+"mt ");
			
			Display.getDefault().syncExec(new Runnable() {
			    public void run() {
			    	text.setText(text.getText()+" "+contador+"mt ");
			    }
			});
			
			
			try {
				sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		//ganador
		Display.getDefault().syncExec(new Runnable() {
		    public void run() {
		    	if(textGanador.getText().equalsIgnoreCase("")){
		    		textGanador.setText(nombre);
		    	}

		    }
		});
		System.out.println("\n Llego a la meta " + nombre);
	}

}
