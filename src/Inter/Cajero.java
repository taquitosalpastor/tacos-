package Inter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cajero {

	private JFrame frmResumenDeCompra;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cajero window = new Cajero();
					window.frmResumenDeCompra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cajero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResumenDeCompra = new JFrame();
		frmResumenDeCompra.getContentPane().setBackground(new Color(192, 192, 192));
		frmResumenDeCompra.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Cajero.class.getResource("/Imag/cajero-automatico.png")));
		lblNewLabel.setBounds(32, 34, 154, 137);
		frmResumenDeCompra.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(256, 34, 293, 137);
		frmResumenDeCompra.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Total de Compra");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 22, 100, 39);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total de Productos");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 81, 100, 39);
		panel.add(lblNewLabel_1_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(128, 255, 255));
		scrollPane.setOpaque(false);
		scrollPane.setBounds(31, 201, 518, 106);
		frmResumenDeCompra.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setOpaque(false);
		table.setBackground(new Color(128, 255, 255));
		table.setGridColor(new Color(128, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		scrollPane.setViewportView(table);
		frmResumenDeCompra.setTitle("Resumen de Compra");
		frmResumenDeCompra.setBounds(100, 100, 599, 354);
		frmResumenDeCompra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
