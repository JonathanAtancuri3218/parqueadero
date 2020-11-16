package ec.ups.edu.g1.parqueadero.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaIngresoTicket extends JFrame {

	private JPanel contentPane;
	private JTextField btnCodigo;
	private JTextField txtFecha;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresoTicket frame = new VentanaIngresoTicket();
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
	public VentanaIngresoTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCodigo = new JTextField();
		btnCodigo.setBackground(Color.LIGHT_GRAY);
		btnCodigo.setBounds(161, 62, 86, 20);
		contentPane.add(btnCodigo);
		btnCodigo.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBackground(Color.LIGHT_GRAY);
		txtFecha.setBounds(161, 119, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(161, 167, 86, 20);
		contentPane.add(txtPlaca);
		
		txtMarca = new JTextField();
		txtMarca.setBackground(Color.LIGHT_GRAY);
		txtMarca.setColumns(10);
		txtMarca.setBounds(161, 226, 86, 20);
		contentPane.add(txtMarca);
		
		txtColor = new JTextField();
		txtColor.setBackground(Color.LIGHT_GRAY);
		txtColor.setColumns(10);
		txtColor.setBounds(276, 226, 86, 20);
		contentPane.add(txtColor);
		
		JLabel lblNewLabel = new JLabel("#");
		lblNewLabel.setBounds(105, 65, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha y Hora Ingreso");
		lblNewLabel_1.setBounds(42, 121, 114, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Placa");
		lblNewLabel_2.setBounds(105, 170, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setBounds(171, 201, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Color");
		lblNewLabel_4.setBounds(286, 201, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(276, 166, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(137, 289, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(276, 289, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_5 = new JLabel("TICKET INGRESO ");
		lblNewLabel_5.setBounds(149, 11, 98, 14);
		contentPane.add(lblNewLabel_5);
	}
}
