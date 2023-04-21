package hilos_CarreraAnimales;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class VentanaCarreraHilos extends ApplicationWindow {
	private Text textConejo;
	private Text textTortuga;
	private Text textLiebre;
	private Text textGanador;

	/**
	 * Create the application window.
	 */
	public VentanaCarreraHilos() {
		super(null);
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(null);

		Group grpCarrera = new Group(container, SWT.NONE);
		grpCarrera.setText("Carrera");
		grpCarrera.setBounds(10, 10, 417, 324);

		textConejo = new Text(grpCarrera, SWT.BORDER | SWT.WRAP | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		textConejo.setBounds(10, 51, 378, 35);

		Label lblConejo = new Label(grpCarrera, SWT.NONE);
		lblConejo.setBounds(10, 24, 68, 21);
		lblConejo.setText("Conejo :");

		Label lblTortuga = new Label(grpCarrera, SWT.NONE);
		lblTortuga.setBounds(10, 107, 55, 21);
		lblTortuga.setText("Tortuga :");

		textTortuga = new Text(grpCarrera, SWT.BORDER | SWT.WRAP | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		textTortuga.setBounds(10, 134, 378, 37);

		Label lblLiebre = new Label(grpCarrera, SWT.NONE);
		lblLiebre.setBounds(10, 181, 55, 21);
		lblLiebre.setText("Liebre :");

		textLiebre = new Text(grpCarrera, SWT.BORDER | SWT.WRAP | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		textLiebre.setBounds(10, 208, 378, 40);

		textGanador = new Text(container, SWT.BORDER);
		textGanador.setBounds(10, 371, 417, 28);

		Label lblGanador = new Label(container, SWT.NONE);
		lblGanador.setBounds(20, 340, 87, 25);
		lblGanador.setText("Ganador");

		Button btnIniciar = new Button(container, SWT.NONE);
		btnIniciar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Animal	conejo = new Animal(1," conejo ",textGanador,textConejo,700);
				Animal	 liebre = new Animal(1," liebre ",textGanador,textLiebre,700);
				Animal	 tortuga = new Animal(1," tortuga ",textGanador,textTortuga,700);
				
				conejo.start();
				tortuga.start();
				liebre.start();
				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				
//				tortuga.start();
//				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				liebre.start();
				
//
			}
		});
		btnIniciar.setBounds(153, 427, 164, 25);
		btnIniciar.setText("Iniciar");

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager.
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			VentanaCarreraHilos window = new VentanaCarreraHilos();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("New Application");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(481, 527);
	}
}
