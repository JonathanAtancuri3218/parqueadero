package ec.ups.edu.g1.parqueadero.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaVehiculo extends JFrame {

	private JPanel contentPane;
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
					VentanaVehiculo frame = new VentanaVehiculo();
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
	public VentanaVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion Vehiculo");
		lblNewLabel.setBounds(120, 11, 103, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa");
		lblNewLabel_1.setBounds(10, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(10, 90, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Color");
		lblNewLabel_3.setBounds(10, 132, 35, 14);
		contentPane.add(lblNewLabel_3);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(48, 50, 253, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(48, 87, 253, 20);
		contentPane.add(txtMarca);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(48, 129, 253, 20);
		contentPane.add(txtColor);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(335, 49, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(23, 227, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnG = new JButton("Guardar");
		btnG.setBounds(120, 227, 89, 23);
		contentPane.add(btnG);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(219, 227, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(318, 227, 89, 23);
		contentPane.add(btnLimpiar);
	}

}
