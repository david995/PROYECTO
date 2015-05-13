import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class InterfazRegistro {

	private JFrame frame;
	private JTextField txtEmailAddress;
	private JTextField txtName;
	private JTextField txtSurname;
	private JPasswordField txtPassword;
	private JCheckBox chcekCondiciones;
	private JLabel txtpnDireccionEmail;
	private JLabel txtpnNombre;
	private JLabel txtpnApellido;
	private JLabel txtpnContraseña;
	private JLabel txtpnFechaDeNacimiento;
	private JTextField textDNI;
	private JTextField textTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRegistro window = new InterfazRegistro();
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
	public InterfazRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setBounds(23, 25, 248, 20);
		txtEmailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(23, 56, 248, 20);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setColumns(10);
		frame.getContentPane().add(txtName);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(23, 86, 248, 20);
		txtSurname.setHorizontalAlignment(SwingConstants.CENTER);
		txtSurname.setColumns(10);
		frame.getContentPane().add(txtSurname);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(23, 114, 248, 20);
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setColumns(10);
		frame.getContentPane().add(txtPassword);
			
		
		chcekCondiciones = new JCheckBox("He leido y acepto las condiciones");
		chcekCondiciones.setBounds(23, 296, 200, 64);
		frame.getContentPane().add(chcekCondiciones);
		
		txtpnDireccionEmail = new JLabel();
		txtpnDireccionEmail.setBounds(297, 25, 106, 20);
		txtpnDireccionEmail.setText("Direccion Email");
		frame.getContentPane().add(txtpnDireccionEmail);
		
		
		txtpnNombre = new JLabel();
		txtpnNombre.setBounds(297, 56, 89, 20);
		txtpnNombre.setText("Nombre");
		frame.getContentPane().add(txtpnNombre);
		
		
		txtpnApellido = new JLabel();
		txtpnApellido.setBounds(297, 86, 89, 20);
		txtpnApellido.setText("Apellido");
		frame.getContentPane().add(txtpnApellido);
		
		
		txtpnContraseña = new JLabel();
		txtpnContraseña.setBounds(297, 114, 89, 20);
		txtpnContraseña.setText("Contrase\u00F1a");
		frame.getContentPane().add(txtpnContraseña);
		
		
		txtpnFechaDeNacimiento = new JLabel();
		txtpnFechaDeNacimiento.setBounds(297, 148, 147, 20);
		txtpnFechaDeNacimiento.setText("DNI");
		frame.getContentPane().add(txtpnFechaDeNacimiento);
		
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBounds(297, 296, 129, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblTelefono = new JLabel();
		lblTelefono.setText("Telefono");
		lblTelefono.setBounds(297, 179, 147, 20);
		frame.getContentPane().add(lblTelefono);
		
		textDNI = new JTextField();
		textDNI.setHorizontalAlignment(SwingConstants.CENTER);
		textDNI.setColumns(10);
		textDNI.setBounds(23, 145, 248, 20);
		frame.getContentPane().add(textDNI);
		
		textTelefono = new JTextField();
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setColumns(10);
		textTelefono.setBounds(23, 179, 248, 20);
		frame.getContentPane().add(textTelefono);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)	{
		
				String strtextAddress = txtEmailAddress.getText();
				String strtextName = txtName.getText();
				String strtextSurname = txtSurname.getText();
				String strtextPassword= txtPassword.getText();
				String strtextDNI = textDNI.getText();
				String strtextTelefono = textTelefono.getText();
		
		

	
				Usuario e1 = new Usuario();
		
				e1.darAltaUsuario(strtextName,strtextDNI,strtextSurname,strtextAddress,strtextPassword,strtextTelefono);
		
			}
		
		});
	}
}

