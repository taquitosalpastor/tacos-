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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JPanel;



public class Login {

	public JFrame Login;
	private JTextField textUsuario;
	private JPasswordField passwordC;
	private JButton btnIniciar;
	String Admin="Admin@Super.CEO";
	String ADMC="557914grtas5";
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	
	
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
		Login.setUndecorated(true);
		
		Login.getContentPane().setLayout(null);
		Login.setLocationRelativeTo(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Imag/heart-card (1).png")));
		lblNewLabel_1.setBounds(-11, 53, 122, 151);
		Login.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Imag/diamond.png")));
		lblNewLabel_2.setBounds(211, 55, 122, 137);
		Login.getContentPane().add(lblNewLabel_2);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 13));
		lblUsuario.setBounds(132, 46, 73, 18);
		Login.getContentPane().add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setForeground(new Color(255, 255, 255));
		lblContraseña.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 13));
		lblContraseña.setBounds(121, 93, 107, 18);
		Login.getContentPane().add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setOpaque(false);
		textUsuario.setForeground(new Color(255, 255, 255));
		textUsuario.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		textUsuario.setBackground(new Color(192, 192, 192));
		textUsuario.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				if (textUsuario.getText().length()>20) {
					e.consume();
					}
			}
		});
		textUsuario.setBounds(111, 74, 110, 20);
		Login.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		passwordC = new JPasswordField();
		passwordC.setOpaque(false);
		passwordC.setForeground(new Color(255, 255, 255));
		passwordC.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		passwordC.setBackground(new Color(192, 192, 192));
		passwordC.setBounds(111, 119, 110, 20);
		Login.getContentPane().add(passwordC);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setForeground(new Color(255, 255, 255));
		btnIniciar.setOpaque(false);
		btnIniciar.setBackground(new Color(0, 0, 255));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Frmc VentU=new Frmc();
					VentU.frmFarmaciaUsuario.setVisible(true);
				
				
				}
			
		});
		btnIniciar.setBounds(111, 149, 110, 30);
		Login.getContentPane().add(btnIniciar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Imag/fondo.jpg")));
		lblNewLabel.setBounds(-81, -56, 495, 433);
		Login.getContentPane().add(lblNewLabel);
	}
	}
	
