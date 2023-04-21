package hilos_CreacionV1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class VentanaServiciosHilos {

	protected Shell shlHilos;
	static ManejadorHilos manejadorServicios;
	int limite = 1;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VentanaServiciosHilos window = new VentanaServiciosHilos();
			
			manejadorServicios = new ManejadorHilos();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlHilos.open();
		shlHilos.layout();
		while (!shlHilos.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlHilos = new Shell();
		shlHilos.setSize(549, 567);
		shlHilos.setText("Hilos");
		
		Composite composite = new Composite(shlHilos, SWT.NONE);
		composite.setBounds(10, 10, 511, 500);
		
		Group grpServicio = new Group(composite, SWT.NONE);
		grpServicio.setText("Servicio 1");
		grpServicio.setBounds(22, 169, 201, 82);
		
		Button btnStart = new Button(grpServicio, SWT.NONE);
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				manejadorServicios.startHiloServicio1();
				
			}
		});
		btnStart.setBounds(10, 36, 75, 25);
		btnStart.setText("Start");
		
		Button btnStop = new Button(grpServicio, SWT.NONE);
		btnStop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorServicios.detenerHiloServicio1();
			}
		});
		btnStop.setBounds(104, 36, 75, 25);
		btnStop.setText("Stop");
		
		Group grpServicio_1 = new Group(composite, SWT.NONE);
		grpServicio_1.setText("Servicio 2");
		grpServicio_1.setBounds(22, 275, 201, 82);
		
		Button btnStart_1 = new Button(grpServicio_1, SWT.NONE);
		btnStart_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manejadorServicios.startHiloServicio2();
			}
		});
		btnStart_1.setBounds(10, 34, 75, 25);
		btnStart_1.setText("Start");
		
		Button btnStop_1 = new Button(grpServicio_1, SWT.NONE);
		btnStop_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorServicios.detenerHiloServicio2();
			}
		});
		btnStop_1.setBounds(105, 34, 75, 25);
		btnStop_1.setText("Stop");
		
		Group grpServicio_2 = new Group(composite, SWT.NONE);
		grpServicio_2.setText("Servicio 3");
		grpServicio_2.setBounds(22, 389, 201, 89);
		
		Button btnStart_2 = new Button(grpServicio_2, SWT.NONE);
		btnStart_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorServicios.startHiloServicio3();

			}
		});
		btnStart_2.setBounds(10, 43, 75, 25);
		btnStart_2.setText("Start");
		
		Button btnStop_2 = new Button(grpServicio_2, SWT.NONE);
		btnStop_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorServicios.detenerHiloServicio3();
			}
		});
		btnStop_2.setBounds(105, 43, 75, 25);
		btnStop_2.setText("Stop");
		
		Label lblFlujoPrincipal = new Label(composite, SWT.NONE);
		lblFlujoPrincipal.setBounds(27, 36, 157, 20);
		lblFlujoPrincipal.setText("Flujo principal : Main");
		
		Button btnMain = new Button(composite, SWT.NONE);
		btnMain.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				while (limite != 10) 
				{
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					System.out.println("Main 2 en ejecución:"+limite++);			
				}
				
				limite = 1;
				
			}
		});
		btnMain.setBounds(141, 71, 90, 30);
		btnMain.setText("Main 2");
		
		Button btnMain_1 = new Button(composite, SWT.NONE);
		btnMain_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				while (limite != 10) 
				{
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					System.out.println("Main 3 en ejecución:"+limite++);			
				}
				limite = 1;
			}
		});
		btnMain_1.setBounds(262, 71, 90, 30);
		btnMain_1.setText("Main 3");
		
		Button btnMain_2 = new Button(composite, SWT.NONE);
		btnMain_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				System.out.println("Main 1 en ejecución: Clic del boton");
			}
		});
		btnMain_2.setBounds(22, 71, 90, 30);
		btnMain_2.setText("Main 1");

	}
}
