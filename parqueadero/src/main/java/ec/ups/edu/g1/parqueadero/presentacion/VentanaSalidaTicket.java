package ec.ups.edu.g1.parqueadero.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JScrollPane;

public class VentanaSalidaTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSalidaTicket frame = new VentanaSalidaTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaSalidaTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Salida");
		lblNewLabel.setBounds(162, 11, 87, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("# horas");
		lblNewLabel_1.setBounds(57, 149, 44, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha y Hora Salida");
		lblNewLabel_2.setBounds(25, 103, 102, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Placa");
		lblNewLabel_3.setBounds(96, 34, 31, 22);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(137, 35, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 70, 206, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 106, 206, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(361, 34, 79, 23);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 151, 206, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha  y Hora Ingreso");
		lblNewLabel_1_1.setBounds(25, 67, 117, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("valor pagar");
		lblNewLabel_1_2.setBounds(44, 185, 55, 25);
		contentPane.add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 187, 206, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(226, 277, 77, 22);
		contentPane.add(btnNewButton_1);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(114, 277, 79, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Calcular");
		btnGuardar.setBounds(361, 171, 79, 23);
		contentPane.add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 140, 440, 89);
		contentPane.add(scrollPane);
	}
}
