package hilos_CreacionV2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;

public class VentanaServiciosHilos {

	protected Shell shlHilos;
	static ManejadorHilos manejadorHilos;
	private Text textValorEntrada;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VentanaServiciosHilos window = new VentanaServiciosHilos();
			
			manejadorHilos = new ManejadorHilos();
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
		shlHilos.setSize(632, 438);
		shlHilos.setText("Hilos");
		
		Composite composite = new Composite(shlHilos, SWT.NONE);
		composite.setBounds(10, 10, 603, 371);
		
		Group grpHilosPropios = new Group(composite, SWT.NONE);
		grpHilosPropios.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		grpHilosPropios.setText("Hilos propios");
		grpHilosPropios.setBounds(10, 10, 228, 300);
		
		Group grpServicio = new Group(grpHilosPropios, SWT.NONE);
		grpServicio.setBounds(10, 23, 201, 82);
		grpServicio.setText("Servicio 1: Contar 1 en 1");
		
		Button btnStart = new Button(grpServicio, SWT.NONE);
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				manejadorHilos.startHiloServicio1();
				
			}
		});
		btnStart.setBounds(10, 36, 75, 25);
		btnStart.setText("Start");
		
		Button btnStop = new Button(grpServicio, SWT.NONE);
		btnStop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorHilos.detenerHiloServicio1();
			}
		});
		btnStop.setBounds(104, 36, 75, 25);
		btnStop.setText("Stop");
		
		Group grpServicio_1 = new Group(grpHilosPropios, SWT.NONE);
		grpServicio_1.setBounds(10, 111, 201, 82);
		grpServicio_1.setText("Servicio 2: Contar 5 en 5");
		
		Button btnStart_1 = new Button(grpServicio_1, SWT.NONE);
		btnStart_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manejadorHilos.startHiloServicio2();
			}
		});
		btnStart_1.setBounds(10, 34, 75, 25);
		btnStart_1.setText("Start");
		
		Button btnStop_1 = new Button(grpServicio_1, SWT.NONE);
		btnStop_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorHilos.detenerHiloServicio2();
			}
		});
		btnStop_1.setBounds(105, 34, 75, 25);
		btnStop_1.setText("Stop");
		
		Group grpServicio_2 = new Group(grpHilosPropios, SWT.NONE);
		grpServicio_2.setBounds(10, 199, 201, 89);
		grpServicio_2.setText("Servicio 3: Contar 10 en 10");
		
		Button btnStart_2 = new Button(grpServicio_2, SWT.NONE);
		btnStart_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorHilos.startHiloServicio3();

			}
		});
		btnStart_2.setBounds(10, 43, 75, 25);
		btnStart_2.setText("Start");
		
		Button btnStop_2 = new Button(grpServicio_2, SWT.NONE);
		btnStop_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				manejadorHilos.detenerHiloServicio3();
			}
		});
		btnStop_2.setBounds(105, 43, 75, 25);
		btnStop_2.setText("Stop");
		
		Group grpHilosNoPropios = new Group(composite, SWT.NONE);
		grpHilosNoPropios.setText("Hilos no propios");
		grpHilosNoPropios.setBounds(274, 10, 302, 300);
		
		Group grpServicioMultiplicar = new Group(grpHilosNoPropios, SWT.NONE);
		grpServicioMultiplicar.setText("Servicio 4: Multiplicar por");
		grpServicioMultiplicar.setBounds(10, 31, 282, 78);
		
		textValorEntrada = new Text(grpServicioMultiplicar, SWT.BORDER);
		textValorEntrada.setBounds(120, 32, 138, 26);
		
		Button btnStart_3 = new Button(grpServicioMultiplicar, SWT.NONE);
		btnStart_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manejadorHilos.startHiloServicio4(Integer.valueOf(textValorEntrada.getText()));
			}
		});
		btnStart_3.setBounds(10, 32, 90, 30);
		btnStart_3.setText("Start");
		
		Group grpServicioSumar = new Group(grpHilosNoPropios, SWT.NONE);
		grpServicioSumar.setText("Servicio 5: Sumar del valor de entrada");
		grpServicioSumar.setBounds(10, 122, 282, 87);
		
		Button btnStart_4 = new Button(grpServicioSumar, SWT.NONE);
		btnStart_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manejadorHilos.startHiloServicio5();
			}
		});
		btnStart_4.setBounds(10, 32, 90, 30);
		btnStart_4.setText("Start");
		
		Button btnStop_3 = new Button(grpHilosNoPropios, SWT.NONE);
		btnStop_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manejadorHilos.detenerHilo();
			}
		});
		btnStop_3.setBounds(10, 236, 90, 30);
		btnStop_3.setText("Stop");

	}
}
