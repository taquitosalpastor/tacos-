package barra;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Redsociall.crudPublicacion;

public class Hola {

 JFrame frmHola;
 JLabel lblHola;
 String nombre="";

	

	public Hola() {
		initialize();
		lblHola.setText("HOLA");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void initialize() {
		frmHola = new JFrame();
		frmHola.setTitle("Hola");
		frmHola.setIconImage(Toolkit.getDefaultToolkit().getImage(Hola.class.getResource("/Redsociall/Memi and dash icons.jpg")));
		frmHola.setBounds(100, 100, 450, 300);
		frmHola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola.setLocationRelativeTo(null);
		frmHola.getContentPane().setLayout(null);
		
		lblHola = new JLabel("hola");
		lblHola.setBorder(new LineBorder(new Color(0,0,0),3,true));
		lblHola.setHorizontalAlignment(SwingConstants.CENTER);
		lblHola.setFont(new Font("Tahoma", Font.BOLD,24));
		lblHola.setBounds(38,77,354,85);
		frmHola.getContentPane().add(frmHola);
	}

}
