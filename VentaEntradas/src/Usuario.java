

public class Usuario {

	private String dni;
	private String email;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String poblacion;
	private int cp;
	private String pais;
	private int telefono;
	
	
	
	
	public Usuario(String dni_, String email_,String nombre_,String apellidos_, String direccion_,String poblacion_, int cp_, String pais_, int telefono_){
		
		dni=dni_;
		nombre=nombre_;
		apellidos=apellidos_;
		direccion=direccion_;
		poblacion=poblacion_;
		cp=cp_;
		pais=pais_;
		telefono=telefono_;
		
	}


	
	
	
	public String getDni() {return dni;}

	public void setDni(String dni) {this.dni = dni;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;	}

	public String getNombre() {return nombre;}

	public void setNombre(String nombre) {this.nombre = nombre;	}

	public String getApellidos() {	return apellidos;	}

	public void setApellidos(String apellidos) {		this.apellidos = apellidos;	}

	public String getDireccion() {return direccion;	}

	public void setDireccion(String direccion) {this.direccion = direccion;	}

	public String getPoblacion() {return poblacion;	}

	public void setPoblacion(String poblacion) {this.poblacion = poblacion;	}

	public int getCp() {return cp;}

	public void setCp(int cp) {this.cp = cp;}

	public String getPais() {return pais;}

	public void setPais(String pais) {this.pais = pais;}

	public int getTelefono() {	return telefono;}

	public void setTelefono(int telefono) {	this.telefono = telefono;}

	
    
    
    
    
	
}





