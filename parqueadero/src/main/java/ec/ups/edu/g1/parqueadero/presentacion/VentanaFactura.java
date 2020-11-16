package ec.ups.edu.g1.parqueadero.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFactura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtDni;
	private JTextField txtNombres;
	private JTextField textField_4;
	private JTextField txtEmail;
	private JTable table;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFactura frame = new VentanaFactura();
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
	public VentanaFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FACTURA ");
		lblNewLabel.setBounds(218, 22, 91, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("# Factura");
		lblNewLabel_1.setBounds(23, 63, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("fecha");
		lblNewLabel_2.setBounds(338, 63, 37, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel labelDni = new JLabel("Dni");
		labelDni.setBounds(38, 88, 31, 14);
		contentPane.add(labelDni);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres");
		lblNewLabel_2_2.setBounds(23, 122, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("# Ticket");
		lblNewLabel_2_3.setBounds(338, 122, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(78, 60, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(79, 88, 154, 20);
		contentPane.add(txtDni);
		
		txtNombres = new JTextField();
		txtNombres.setBackground(Color.LIGHT_GRAY);
		txtNombres.setColumns(10);
		txtNombres.setBounds(78, 119, 154, 20);
		contentPane.add(txtNombres);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setColumns(10);
		textField_4.setBounds(385, 119, 154, 20);
		contentPane.add(textField_4);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.LIGHT_GRAY);
		txtEmail.setColumns(10);
		txtEmail.setBounds(78, 150, 154, 20);
		contentPane.add(txtEmail);
		
		JLabel labelEmail = new JLabel("email");
		labelEmail.setBounds(23, 153, 37, 14);
		contentPane.add(labelEmail);
		
		JButton btnBuscarDni = new JButton("Buscar");
		btnBuscarDni.setBounds(243, 88, 78, 23);
		contentPane.add(btnBuscarDni);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 201, 506, 197);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Valor", "Fecha y Hora Salida", "Fecha y Hora Ingreso", "Placa"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_3 = new JLabel("Valor Total");
		lblNewLabel_3.setBounds(385, 412, 65, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(453, 409, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(56, 453, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGuardar.setBounds(220, 453, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(361, 453, 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(385, 63, 154, 14);
		contentPane.add(lblNewLabel_4);
	}

}
