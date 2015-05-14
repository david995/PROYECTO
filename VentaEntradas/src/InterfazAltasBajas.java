import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InterfazAltasBajas {

	private JFrame frame;
	private JTextField textID;
	private JTextField textNombre;
	private JTextField textDireccion;
	private JTextField textCiudad;
	private JTextField textPoblacion;
	private JTextField textHora;
	private JTextField textFecha;
	private JTextField textTipo;
	private JButton botonAñadirEvento;
	private JButton botonCancelarEvento;
	private JTextField txtSala;
	private JTextField txtAsiento;
	private JTextField txtNumeroDeEntradas;
	private JTextField txtDatos;
	private JTextField txtPais;
	private JTextField txtAforo;
	private JTextField txtCodigopostal;
	private JTextField txtNombrelugar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAltasBajas window = new InterfazAltasBajas();
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
	public InterfazAltasBajas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textID = new JTextField();
		textID.setBounds(37, 5, 86, 20);
	
		textID.setHorizontalAlignment(SwingConstants.CENTER);
		textID.setText("ID");
		frame.getContentPane().add(textID);
		textID.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(128, 5, 86, 20);
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textNombre.setText("NombreEvento");
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		textDireccion.setBounds(219, 5, 86, 20);
		textDireccion.setText("Direccion");
		frame.getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(310, 5, 114, 20);
		textCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		textCiudad.setText("Ciudad");
		frame.getContentPane().add(textCiudad);
		textCiudad.setColumns(10);
		
		textPoblacion = new JTextField();
		textPoblacion.setBounds(37, 30, 86, 20);
		textPoblacion.setHorizontalAlignment(SwingConstants.CENTER);
		textPoblacion.setText("Poblacion");
		frame.getContentPane().add(textPoblacion);
		textPoblacion.setColumns(10);
		
		textHora = new JTextField();
		textHora.setBounds(128, 30, 86, 20);
		textHora.setHorizontalAlignment(SwingConstants.CENTER);
		textHora.setText("Hora");
		frame.getContentPane().add(textHora);
		textHora.setColumns(10);
		
		textFecha = new JTextField();
		textFecha.setBounds(219, 30, 86, 20);
		textFecha.setHorizontalAlignment(SwingConstants.CENTER);
		textFecha.setText("Fecha");
		frame.getContentPane().add(textFecha);
		textFecha.setColumns(10);
		
		textTipo = new JTextField();
		textTipo.setBounds(310, 30, 114, 20);
		textTipo.setHorizontalAlignment(SwingConstants.CENTER);
		textTipo.setText("Tipo");
		frame.getContentPane().add(textTipo);
		textTipo.setColumns(10);
		
		txtSala = new JTextField();
		txtSala.setText("Sala");
		txtSala.setHorizontalAlignment(SwingConstants.CENTER);
		txtSala.setColumns(10);
		txtSala.setBounds(37, 61, 86, 20);
		frame.getContentPane().add(txtSala);
		
		txtAsiento = new JTextField();
		txtAsiento.setText("Asiento");
		txtAsiento.setHorizontalAlignment(SwingConstants.CENTER);
		txtAsiento.setColumns(10);
		txtAsiento.setBounds(128, 61, 86, 20);
		frame.getContentPane().add(txtAsiento);
		
		txtNumeroDeEntradas = new JTextField();
		txtNumeroDeEntradas.setText("Numero de entradas");
		txtNumeroDeEntradas.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroDeEntradas.setColumns(10);
		txtNumeroDeEntradas.setBounds(310, 61, 114, 20);
		frame.getContentPane().add(txtNumeroDeEntradas);
		
		txtDatos = new JTextField();
		txtDatos.setText("Datos");
		txtDatos.setHorizontalAlignment(SwingConstants.CENTER);
		txtDatos.setColumns(10);
		txtDatos.setBounds(219, 61, 86, 20);
		frame.getContentPane().add(txtDatos);
		
		txtPais = new JTextField();
		txtPais.setText("Pais");
		txtPais.setHorizontalAlignment(SwingConstants.CENTER);
		txtPais.setColumns(10);
		txtPais.setBounds(37, 92, 86, 20);
		frame.getContentPane().add(txtPais);
		
		txtAforo = new JTextField();
		txtAforo.setText("Aforo");
		txtAforo.setHorizontalAlignment(SwingConstants.CENTER);
		txtAforo.setColumns(10);
		txtAforo.setBounds(128, 92, 86, 20);
		frame.getContentPane().add(txtAforo);
		
		txtCodigopostal = new JTextField();
		txtCodigopostal.setText("CodigoPostal");
		txtCodigopostal.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodigopostal.setColumns(10);
		txtCodigopostal.setBounds(219, 92, 86, 20);
		frame.getContentPane().add(txtCodigopostal);
		
		txtNombrelugar = new JTextField();
		txtNombrelugar.setText("NombreLugarEvento");
		txtNombrelugar.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombrelugar.setColumns(10);
		txtNombrelugar.setBounds(310, 92, 114, 20);
		frame.getContentPane().add(txtNombrelugar);
		
		
		
		botonAñadirEvento = new JButton("A\u00F1adir Evento");
		botonAñadirEvento.setBounds(50, 145, 141, 59);
		frame.getContentPane().add(botonAñadirEvento);
		botonAñadirEvento.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)	{
			
			String strtextID = textID.getText();
			String strtextNombre = textNombre.getText();
			String strtextDireccion = textDireccion.getText();
			String strtextCiudad = textCiudad.getText();
			String strtextEstado = textPoblacion.getText();
			String strtextHora = textHora.getText();
			String strstrtextFecha = textFecha.getText();
			String strtextTipo = textTipo.getText();
			String  strtxtSala =txtSala.getText() ;
			String  strtxtAsiento=txtAsiento.getText();
			String  strtxtNumeroDeEntradas=txtNumeroDeEntradas.getText();
			String  strtxtDatos=txtDatos.getText();
			String  strtxtPais=txtPais.getText();
			String  strtxtAforo=txtAforo.getText();
			String strtxtCodigopostal= txtCodigopostal.getText();
			String strtxtNombrelugar=txtNombrelugar.getText();

		
			Evento e1 = new Evento();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			Date fechaD = null;
			
			try {
				fechaD = formato.parse(strstrtextFecha+" "+strtextHora);
			} catch (ParseException e2) {
				e2.printStackTrace();
			}
			e1.DarAlta(Integer.parseInt(strtextID),strtextNombre,strtextDireccion,strtextCiudad,strtextEstado,fechaD,strtextTipo,strtxtSala,strtxtAsiento,strtxtNumeroDeEntradas,strtxtDatos,strtxtPais,strtxtAforo,strtxtCodigopostal,strtxtNombrelugar);
			JOptionPane.showMessageDialog(null,"Has añadido un evento");
			
		}
		});
	
		
		
		botonCancelarEvento = new JButton("Cancelar Evento");
		botonCancelarEvento.setBounds(269, 145, 141, 59);
		frame.getContentPane().add(botonCancelarEvento);
		botonCancelarEvento.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e2)	{
			String strtextID = textID.getText();

			Evento e1 = new Evento();
			e1.DarBaja(Integer.parseInt(strtextID));
			JOptionPane.showMessageDialog(null,"Has borrado un evento");
			
			}
			

			});
		
	}

	
}

