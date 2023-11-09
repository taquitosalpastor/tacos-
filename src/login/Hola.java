package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Hola {

	 JFrame frmHola;
	 JLabel lblHola;
	 String nombre="";


	public Hola() {
		initialize();
	
	}
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void initialize() {
		frmHola = new JFrame();
		frmHola.setIconImage(Toolkit.getDefaultToolkit().getImage(Hola.class.getResource("/Redsociall/descargar.jpeg")));
		frmHola.setTitle("hola");
		frmHola.setBounds(100, 100, 605, 363);
		frmHola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola.getContentPane().setLayout(null);
		frmHola.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("HOLA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 93));
		lblNewLabel.setBounds(0, -11, 292, 155);
		frmHola.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Hola.class.getResource("/Redsociall/descargar (3).jpg")));
		lblNewLabel_1.setBounds(281, 37, 380, 279);
		frmHola.getContentPane().add(lblNewLabel_1);
	}
}
