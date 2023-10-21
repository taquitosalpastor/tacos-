package Redsociall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class crudPublicacion {

	public JFrame frame;
	private JTextField textField;
	private JTable table;

	public crudPublicacion() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 576);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(29, 30, 79, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(131, 30, 182, 31);
		frame.getContentPane().add(comboBox);
		
		JLabel lblTexto = new JLabel("texto");
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblTexto.setBounds(29, 112, 79, 67);
		frame.getContentPane().add(lblTexto);
		
		textField = new JTextField();
		textField.setBounds(131, 87, 220, 148);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 274, 554, 218);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(418, 39, 133, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnActualizar.setBounds(418, 89, 133, 39);
		frame.getContentPane().add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBorrar.setBounds(418, 139, 133, 39);
		frame.getContentPane().add(btnBorrar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEliminar.setBounds(418, 196, 133, 39);
		frame.getContentPane().add(btnEliminar);
	}
}
