import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.swing.JOptionPane;


public class Evento {
	
	
	
	private int id;
	private String nombre;
	private String localCelebracion;
	private String ciudad;
	private String estado;
	private Date fecha;
	private String tipo;
	private static int entradasTotales=100;
	private int entradasDisponibles;
	private int entradasReservadas;
	private int numSerieEntrada [];
	private int contador=entradasTotales-entradasDisponibles;
	
	
	public Evento(){
		
	}
	
	public Evento(int id_, String nombre_, String localCelebracion_, String ciudad_, String estado_, Date fecha_, String tipo_){
		
		id=id_;
		nombre=nombre_;
		localCelebracion=localCelebracion_;
		ciudad=ciudad_;
		estado=estado_;
		fecha=fecha_;
		tipo=tipo_;
		
		
		
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
	public String getLocalCelebracion() {
		return localCelebracion;
	}
	public void setLocalCelebracion(String localCelebracion) {
		this.localCelebracion = localCelebracion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
	
	public void DarAlta(int id_,String nombre_,String localCelebracion_, String ciudad_,String estado_,Date fecha_,String tipo_){
		
	     
			String driver = "org.postgresql.Driver";
			String connectString = "jdbc:postgresql://localhost:5432/Taller";
			String user = "postgres";
			String password = "tonphp";
			
	         try{
	            Class.forName(driver);
	            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
	            Statement consulta= connect.createStatement();
	            consulta.executeUpdate("insert into Evento (ID, Nombre, Apellidos, Email, Contraseña, Teléfono) values('"+id_+"','"+nombre_+"','"+localCelebracion_+"','"+ciudad_+"','"+estado_+"','"+fecha_+" "+tipo_+"')");

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
            consulta.executeUpdate("delete into Evento(ID) values('"+id_+"')");

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


