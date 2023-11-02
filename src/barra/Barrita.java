package barra;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import com.mysql.cj.protocol.a.NativePacketHeader;

public class Barrita {

	private JFrame frmBarradeprogreso;
	private JProgressBar barraProgreso;
	String nombre="";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barrita window = new Barrita();
					window.frmBarradeprogreso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Barrita() {
		initialize();
		start();
	}
public void start() {
	Thread hilo=new Thread(new Runnable() {
		
		@Override
		public void run() {
		 for (int i =0; i<=100;i++) {
			 barraProgreso.setValue(i);
			 try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 if(i==100) {
				 Hola hola=new Hola();
				 hola.frmHola.setVisible(true);
				 frmBarradeprogreso.setVisible(false);
			 }
		 }
			
		}
	});
	hilo.start();
}
	
	private void initialize() {
		frmBarradeprogreso = new JFrame();
		frmBarradeprogreso.setTitle("BarraDeProgreso");
		frmBarradeprogreso.setBounds(100, 100, 450, 300);
		frmBarradeprogreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBarradeprogreso.setLocationRelativeTo(null);
		frmBarradeprogreso.getContentPane().setLayout(null);
		
		barraProgreso = new JProgressBar();
		barraProgreso.setForeground(Color.RED);
		barraProgreso.setFont(new Font("Tahoma", Font.BOLD, 20));
		barraProgreso.setStringPainted(true);
		barraProgreso.setBounds(50,65,342,45);
		frmBarradeprogreso.getContentPane().add(barraProgreso);
	}

}
