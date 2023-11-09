package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BarraDeCarga {

	public JFrame frmBarrraDeProgreso;
	private JProgressBar progressBar;
	private JButton btnStart;
	String  Nombre="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraDeCarga window = new BarraDeCarga();
					window.frmBarrraDeProgreso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BarraDeCarga() {
		initialize();
		Start();
	}

	public void Start() {
		Thread hilo=new Thread(new Runnable() {
			

			@Override
			public void run() {
				for(int i=0;i<=100;i++) {
					progressBar.setValue(i);
					try {
						Thread.sleep(25);
					}catch (InterruptedException e) {
						e.printStackTrace();
				}
					if(i==100) {
						Hola Hola=new Hola();
						Hola.frmHola.show(true);
						frmBarrraDeProgreso.show(false);
					}
				}
				
			}
			
		});
		hilo.start();
	}
	
	private void initialize() {
		frmBarrraDeProgreso = new JFrame();
		frmBarrraDeProgreso.setIconImage(Toolkit.getDefaultToolkit().getImage(BarraDeCarga.class.getResource("/login/lon.jpg")));
		frmBarrraDeProgreso.setTitle("Barra de Progreso");
		frmBarrraDeProgreso.setBounds(100, 100, 450, 156);
		frmBarrraDeProgreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBarrraDeProgreso.getContentPane().setLayout(null);
		frmBarrraDeProgreso.setLocationRelativeTo(null);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(128, 128, 192));
		progressBar.setStringPainted(true);
		progressBar.setBounds(92, 31, 243, 22);
		frmBarrraDeProgreso.getContentPane().add(progressBar);
		
		
	}
}
