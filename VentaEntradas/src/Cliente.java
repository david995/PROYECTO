import java.security.MessageDigest;

public class Cliente extends Usuario{
	
	//Atr
	private int puntos;
	private int ofertas;
	private String contraseña;
	
	
	//Const
	public Cliente(String dni_, String email_, String nombre_, String apellidos_,String direccion_, String poblacion_, int cp_, String pais_,int telefono_,int puntos_, int ofertas_,String contraseña_) {
		super(dni_, email_, nombre_, apellidos_, direccion_, poblacion_, cp_, pais_,telefono_);
		
		puntos = puntos_;
		ofertas = ofertas_;
		contraseña = contraseña_;
	}
	
	//Meth
	public void setSumaPuntos(int puntos_) {
		puntos = puntos+puntos_;
	}
	
	public void setRestaPuntos(int puntos_) {
		puntos = puntos-puntos_;
	}


	public int getPuntos() {
		return puntos;
		
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getOfertas() {
		return ofertas;
	}

	public void setOfertas(int ofertas) {
		this.ofertas = ofertas;
	}

	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	/* 
	* Encripta un String con el algoritmo MD5, usando el metodo hash y devuelve la contraseñaEncriptada
	*/ 
	public String encriptarMD5(String palabra){ 
		palabra = getContraseña();
		String contraseñaEncriptada=""; 
		
		try { 
		contraseñaEncriptada = hash(palabra); 
		} 
		catch (Exception e) { 
		throw new Error("Error: Al encriptar el password"); 
		} 
		return contraseñaEncriptada; 
		//System.out.println(contraseñaEncriptada);
		} 

	
	
	/*
	Encriptador de contraseña
	*/ 
	private String hash(String clear) throws Exception { 
		MessageDigest md = MessageDigest.getInstance("MD5"); 
		byte[] b = md.digest(clear.getBytes()); 
		int size = b.length; 
		StringBuffer h = new StringBuffer(size); 
		for (int i = 0; i < size; i++) { 
		int u = b [ i ] & 255 ;
		
		if (u<16){
			h.append("0"+Integer.toHexString(u)); 
		}else { 
		h.append(Integer.toHexString(u)); 
		} 
		} 
		return h.toString(); 
		}

}




