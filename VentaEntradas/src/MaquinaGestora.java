import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class MaquinaGestora {
	
	
	//ArrayList<Usuario> arraylistusuario = new ArrayList<Usuario>();
	
	/*
	public void darAltaUsuario()
	public void darBajaUsuario()
	existeUsuario(dni)
	string BuscarEventoActivo()
*/
	 
	public void darAltaUsuario(String Nombre, String DNI, String Apellidos, String Email, String Contraseña, int Telefono, int Punto ){

        // Insertar datos a la bd:
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5432/ventaentradas";
		String user = "postgres";
		String password = "tonphp";
		
         try{
            Class.forName(driver);
            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) connect.createStatement();
            consulta.executeUpdate("insert into usuarios(DNI, Nombre, Apellidos, Email, Contraseña, Telefono, Punto) values('"+Nombre+"','"+DNI+"','"+Apellidos+"','"+Email+"','"+Contraseña+"','"+Telefono+"','"+Punto+"')");

         } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"El usuario ya existe");

        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error inesperado");
    } 
}
	
	public void darBajaUsuario(int DNI, String Nombre){
		
		
		
			 // Insertar datos a la bd:
			String driver = "org.postgresql.Driver";
			String connectString = "jdbc:postgresql://localhost:5432/ventaentradas";
			String user = "postgres";
			String password = "tonphp";
			
	         try{
	            Class.forName(driver);
	            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
	            Statement consulta=(Statement) connect.createStatement();
	            consulta.executeUpdate("DELETE FROM usuario  WHERE  Nombre = '"+Nombre+"'  AND DNI = '"+DNI+"';");

	         } catch(SQLException e){
	            JOptionPane.showMessageDialog(null,"Usuario borrado");

	        } catch(ClassNotFoundException e){
	            JOptionPane.showMessageDialog(null,"Error inesperado");
	    } 
	
			
		
		
	}
	
	
	public ResultSet BuscarEvento(String Nombre){
		 
		ResultSet rs = null;
		 // Insertar datos a la bd: //modificar conexion en caso de que no funcione
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5433/ventanentradas";
		String user = "postgres";
		String password = "event4all";
		
         try{
            Class.forName(driver);
            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) connect.createStatement();
           rs=  consulta.executeQuery("SELECT * FROM EVENTO  WHERE  Nombre = '"+Nombre+"'");

         } catch(SQLException e){
          

        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"No hay eventos con ese nombre");
    } 

		
		
         return rs;	
		
	 }
	

	public ResultSet BuscarEventosActivo(){
		
		ResultSet rs = null;
		 // Insertar datos a la bd: //modificar conexion en caso de que no funcione
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5433/ventanentradas";
		String user = "postgres";
		String password = "event4all";
		
		
         try{
        	
            Class.forName(driver);
            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) connect.createStatement();
            rs = consulta.executeQuery("SELECT * FROM evento  WHERE  estado='activo'");
            if(rs!=null){
            }else{
            }
           
         } catch(Exception e){
          
        	 System.out.println(e.toString());

        } 
		return rs;
		
			
		
	 }
	
	
	
	public void existeUsuario(int DNI, String Nombre){
		
		 // Insertar datos a la bd:
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5432/ventaentradas";
		String user = "postgres";
		String password = "tonphp";
		
         try{
            Class.forName(driver);
            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) connect.createStatement();
            consulta.executeUpdate("SELECT DNI,Nombre FROM USUARIO  WHERE  Nombre = '"+Nombre+"' AND DNI = "+DNI+" ");

         } catch(SQLException e){
          

        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"No existe el usuario");
    } 

		
		
		
	}
	
	

	public static void main(String[] args){
	String driver = "org.postgresql.Driver";
	String connectString = "jdbc:postgresql://localhost:5432/Taller";
	String user = "postgres";
	String password = "tonphp";

	try{
	Class.forName(driver);
	Connection con = DriverManager.getConnection(connectString, user , password);
	Statement stmt = con.createStatement();

	ResultSet rs = stmt.executeQuery("SELECT * FROM cabecera_trabajo");

	while (rs.next()){
	System.out.println("CEDULA " + rs.getString("cedula_cliente"));
	}

	stmt.close();
	con.close();

	}

	catch ( Exception e ){
	System.out.println(e.getMessage());
	}
	
	
	
	
	
	}
	
	
	
	
	
}





