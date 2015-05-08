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
	private JTextField textLocalcelebracion;
	private JTextField textCiudad;
	private JTextField textEstado;
	private JTextField textHora;
	private JTextField textFecha;
	private JTextField textTipo;
	private JButton botonAñadirEvento;
	private JButton botonCancelarEvento;

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
		textNombre.setText("Nombre");
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textLocalcelebracion = new JTextField();
		textLocalcelebracion.setBounds(219, 5, 86, 20);
		textLocalcelebracion.setText("LocalCelebracion");
		frame.getContentPane().add(textLocalcelebracion);
		textLocalcelebracion.setColumns(10);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(310, 5, 86, 20);
		textCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		textCiudad.setText("Ciudad");
		frame.getContentPane().add(textCiudad);
		textCiudad.setColumns(10);
		
		textEstado = new JTextField();
		textEstado.setBounds(37, 30, 86, 20);
		textEstado.setHorizontalAlignment(SwingConstants.CENTER);
		textEstado.setText("Estado");
		frame.getContentPane().add(textEstado);
		textEstado.setColumns(10);
		
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
		textTipo.setBounds(310, 30, 86, 20);
		textTipo.setHorizontalAlignment(SwingConstants.CENTER);
		textTipo.setText("Tipo");
		frame.getContentPane().add(textTipo);
		textTipo.setColumns(10);
		
		
		
		botonAñadirEvento = new JButton("A\u00F1adir Evento");
		botonAñadirEvento.setBounds(108, 55, 101, 23);
		frame.getContentPane().add(botonAñadirEvento);
		botonAñadirEvento.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)	{
			
			String strtextID = textID.getText();
			String strtextNombre = textNombre.getText();
			String strtextLocalcelebracion = textLocalcelebracion.getText();
			String strtextCiudad = textCiudad.getText();
			String strtextEstado = textEstado.getText();
			String strtextHora = textHora.getText();
			String strstrtextFecha = textFecha.getText();
			String strtextTipo = textTipo.getText();
		
			Evento e1 = new Evento();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			Date fechaD = null;
			
			try {
				fechaD = formato.parse(strstrtextFecha+" "+strtextHora);
			} catch (ParseException e2) {
				e2.printStackTrace();
			}
			e1.DarAlta(Integer.parseInt(strtextID),strtextNombre,strtextLocalcelebracion,strtextCiudad,strtextEstado,fechaD,strtextTipo );
			JOptionPane.showMessageDialog(null,"Has añadido un evento");
			
		}
		});
	
		
		
		botonCancelarEvento = new JButton("Cancelar Evento");
		botonCancelarEvento.setBounds(214, 55, 111, 23);
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


