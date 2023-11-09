package login;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import Redsociall.Usuario;
import Redsociall.DataUsuario;

public class Login {

	private JFrame frame;
	private JTextField txtCorreo;
	private JButton btnNewButton;
	private JPasswordField txtPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Redsociall/_0.jpg")));
	//	lblNewLabel.setIcon(cambiar(new ImageIcon(Login.class.getResource("/login/lon.png")),140,140));
		lblNewLabel.setBounds(103,20,222,185);
		frame.getContentPane().add(lblNewLabel);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(128,246,197,35);
		frame.getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("correo");
		lblNewLabel_1.setBounds(51,256,46,14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("password");
		lblNewLabel_1_1.setBounds(51,315,46,14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		btnNewButton = new JButton("iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario x=new Usuario();
					x.setCorreo(txtCorreo.getText());
					x.setPassword(encriptarPassword(txtPassword.getText()));
					if(x.login()) {
						JOptionPane.showMessageDialog(null, "BIENVENIDO");
						BarraDeCarga b = new BarraDeCarga();
						frame.setVisible(false);
						b.frmBarrraDeProgreso.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "correou/o password incorrecto");
					}
				} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "error");
				}
			}
		});
		btnNewButton.setBounds(177,368,89,23);
		frame.getContentPane().add(btnNewButton);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(128, 313, 183, 19);
		frame.getContentPane().add(txtPassword);
	}
	public ImageIcon cambiar (ImageIcon img, int ancho,int alto) {
		Image imgEscalada = img.getImage().getScaledInstance(ancho, ancho, Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imgEscalada);
		return image;
	}
	public String encriptarPassword(String password) {

	      MessageDigest md;
	      byte[] encoded = null;
		try {
			md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
			 md.update(password.getBytes());
		      byte[] digest = md.digest();

		      for (byte b : digest) {
		         //System.out.print(Integer.toHexString(0xFF & b));
		      }
		      System.out.println();

		      encoded = Base64.encodeBase64(digest);
		      //System.out.println(new String(encoded));	
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      return new String(encoded);
	}
}
