import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Evento {
	
	
	
	private int id;
	private String nombre;
	private String Direccion;
	private String poblacion;
	private String estado;
	private Date fecha;
	private String tipo;
	private static int entradasTotales=100;
	private int entradasDisponibles;
	private int entradasReservadas;
	private int numSerieEntrada [];
	private int contador=entradasTotales-entradasDisponibles;
	
	private String Sala;
	private String Asiento;
	private String NumeroDeEntradas;
	private String Datos;
	private String Pais;
	private String Aforo;
	private String codigoPostal;
	private String NombreLugarEvento;
	
	
	
	public Evento(){
		
	}
	
	public Evento(int id_, String nombre_, String Direccion_, String poblacion_, 
			String estado_, Date fecha_, String tipo_,String Sala_,String Asiento_,String NumeroDeEntradas_,String 
			Datos_,String Pais_,String Aforo_,String codigoPostal_){
		
		id=id_;
		nombre=nombre_;
		Direccion=Direccion_;
		poblacion=poblacion_;
		estado=estado_;
		fecha=fecha_;
		tipo=tipo_;
		Sala=Sala_;
		Asiento=Asiento_;
		NumeroDeEntradas=NumeroDeEntradas_;
		Datos=Datos_;
		Pais=Pais_;
		Aforo=Aforo_;
		codigoPostal=codigoPostal_;
		NombreLugarEvento=NombreLugarEvento;
		
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion_(String localCelebracion) {
		this.Direccion = localCelebracion;
	}
	public String setPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String ciudad) {
		this.poblacion = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void DarAlta(int id_,String nombre_,String Direccion_, String poblacion_,String estado_,Date fecha_,String tipo_,String Sala_,String Asiento_,String NumeroDeEntradas_,String 
			Datos_,String Pais_,String Aforo_,String codigoPostal_,String NombreLugarEvento_){
		
	     
			String driver = "org.postgresql.Driver";
			String connectString = "jdbc:postgresql://localhost:5432/Taller";
			String user = "postgres";
			String password = "tonphp";
			
	         try{
	            Class.forName(driver);
	            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
	            Statement consulta= connect.createStatement();
	            consulta.executeUpdate("insert into evento (ID, Nombre, Estado, Fecha_Hora, Sala, Asiento, Datos, Num_Entradas_Disponibles) values('"+id_+"','"+nombre_+"','"+estado_+"','"+fecha_+"','"+Sala_+"','"+Asiento_+"','"+Datos_+" "+NumeroDeEntradas_+"')");
	            consulta.executeUpdate("insert into lugar_evento (Nombre, tipo, aforo, direccion, poblacion, codigo_postal, pais) values('"+NombreLugarEvento_+"','"+tipo_+"','"+Aforo_+"','"+Direccion_+"','"+poblacion_+"','"+codigoPostal_+"','"+Pais_+" ')");

	         } catch(SQLException e){
	            JOptionPane.showMessageDialog(null,"El evento ya existe");

	        } catch(ClassNotFoundException e){
	            JOptionPane.showMessageDialog(null,"Error inesperado");
	    } 
	}


	public void DarBaja(int id_){
		
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5432/Taller";
		String user = "postgres";
		String password = "tonphp";
		
         try{
            Class.forName(driver);
            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) connect.createStatement();
            consulta.executeUpdate("delete into EVENTO(ID) values('"+id_+"')");

         } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"El evento ya existe");

        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error inesperado");
    } 
}
	
	
	public String reservarEntradas(int numEntradas){
		String msg="Entradas reservadas";
		
		numSerieEntrada=new int [numEntradas];
		
		for(int i=0; i<numSerieEntrada.length;i++){
			
			if(numSerieEntrada[i]==(Integer)null){
				
				numSerieEntrada[i]=contador;
				contador++;
				entradasDisponibles--;
				entradasReservadas++;
			}
			
		}
		
		return msg;
	}
	
	public String cancelarReservaEntrada(int numserie){
		
		String msg="Entrada "+numserie+"cancelada";
		
		for(int i=0;i<numSerieEntrada.length;i++){
			if(numSerieEntrada[i]==numserie){
				numSerieEntrada[i]=(Integer) null;
				contador--;
				 entradasDisponibles++;
				 entradasReservadas++;
			}
			
		}
		
		return msg;
	}
	
	
}//FIN CLASE

