package ec.ups.edu.g1.parqueadero.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.ups.edu.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.g1.parqueadero.negocio.GestionTicketON;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.inject.Inject;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VentanaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtTipoDocumento;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private Cliente cli;
	private GestionTicketON metodosbd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente frame = new VentanaCliente();
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
	public VentanaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion Cliente");
		lblNewLabel.setBounds(149, 11, 106, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dni");
		lblNewLabel_1.setBounds(68, 46, 26, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo Documento");
		lblNewLabel_1_1.setBounds(20, 84, 82, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1_1.setBounds(56, 124, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1.setBounds(56, 162, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtDni = new JTextField();
		txtDni.setBounds(106, 43, 212, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(106, 84, 212, 20);
		contentPane.add(txtTipoDocumento);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(106, 121, 212, 20);
		contentPane.add(txtNombre);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(106, 159, 212, 20);
		contentPane.add(txtEmail);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(328, 42, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(20, 252, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        try {
						guardar();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				

				
			}
			
			 public void guardar() throws SQLException {
				 cli.setDni(txtDni.getText());
				 cli.setTipoDocumento(Integer.parseInt((txtTipoDocumento.getText())));
				 cli.setNombre(txtNombre.getText());
				 cli.setEmail(txtEmail.getText());
				 metodosbd.registrarCliente(cli);

				 
			
				   
			   }
		});
  
		btnNewButton_2.setBounds(149, 252, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Limpiar");
		btnNewButton_2_1.setBounds(269, 252, 89, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Listar");
		btnNewButton_2_1_1.setBounds(368, 252, 69, 23);
		contentPane.add(btnNewButton_2_1_1);
	}
}
