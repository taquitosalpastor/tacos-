package Inter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class Login {

	public JFrame Login;
	private JTextField textUsuario;
	private JPasswordField passwordC;
	private JButton btnIniciar;
	private JButton btnRegis;
	String Admin="Admin@Super.CEO";
	String ADMC="557914grtas5";

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.Login.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		initialize();
	}

	
	
	private void initialize() {
		Login = new JFrame();
		Login.getContentPane().setBackground(new Color(0, 255, 255));
		Login.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Imag/persona.png")));
		Login.setTitle("Login ");
		Login.setBounds(100, 100, 347, 314);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		Login.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Imag/persona (2).png")));
		lblNewLabel.setBounds(126, 0, 71, 87);
		Login.getContentPane().add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblUsuario.setBounds(39, 90, 59, 18);
		Login.getContentPane().add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblContraseña.setBounds(39, 119, 71, 18);
		Login.getContentPane().add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				if (textUsuario.getText().length()>20) {
					e.consume();
					}
			}
		});
		textUsuario.setBounds(111, 90, 110, 20);
		Login.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		passwordC = new JPasswordField();
		passwordC.setBounds(111, 119, 110, 20);
		Login.getContentPane().add(passwordC);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Frmc VentU=new Frmc();
					VentU.frmFarmaciaUsuario.setVisible(true);
				
				
				}
			
		});
		btnIniciar.setBounds(111, 149, 110, 30);
		Login.getContentPane().add(btnIniciar);
		
		btnRegis = new JButton("Registro");
		btnRegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Esto es para al momento de darle al boton de registro 
				 * te dirija a la ventana 
				 */
				Registro Reg=new Registro();
				Reg.Registrossss.setVisible(true);
			}
		});
		btnRegis.setBounds(228, 11, 93, 30);
		Login.getContentPane().add(btnRegis);
	}
	
	}
	
