package es.ifp.programacion.ejercicio.retouf4;

public class Usuario {
	
	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private String DNI;
	private String correo;
	private String telefono;
	
	
	//Connstructores
	
	/**
	 * Constructor con todos los parámetros
	 * @param nombre del usuario
	 * @param apellidos del usuario
	 * @param DNI del usuario
	 * @param correo del usuario
	 * @param telefono del usuario
	 */
	public Usuario (String nombre, String apellidos, String DNI, String correo, String telefono) {
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
		this.correo=correo;
		this.telefono=telefono;
		
	}
	/**
	 * Constructor con 3 parámetros que permite crear un usuario con los datos de nombre, apellidos y DNI.	
	 * @param nombre del usuario
	 * @param apellidos del usuario
	 * @param DNI del usuario
	 */
	public Usuario (String nombre, String apellidos, String DNI) {
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
		
	}
		
	
	
	
	//Métodos


	/**
	 * Método que retorna el nombre del usuario y hace posible el acceso desde otra clase.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Método que permite la modificación del Nombre del usuario.
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Método que retorna los apellidos del usuario y permite acceder a ellos desde otra clase.
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * Método que permite la modificación de los apellidos del usuario.
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * Método que retorna el DNI del usuario y que permite el acceso a estos datos desde otra clase.
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}


	/**
	 * Método que permite la modificación del DNI.
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dni) {
		DNI = dni;
	}


	/**
	 * Método que retorna el correo electrónico del usuario y permite acceder al dato desde otra clase.
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}


	/**
	 * Método que permite la modificación del correo electrónico del usuario.
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
	 * Método que retorna el teléfono del usuario y permite el acceso al dato desde otra clase.
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * Método que permite la modificación del teléfono del usuario.
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * Método toString que sobreescribe y formatea los datos que nos devuelve la clase a través de sus métodos get.
	 */
	@Override
	public String toString () {
		
		if(getCorreo()!=null) {
		
		return "============DATOS DEL USUARIO============\n\n"	
				+"Nombre: " +getNombre()+"\n"
		+"Apellidos: " +getApellidos()+"\n"
		+"DNI: " +getDNI() +"\n"
		+"Correo Electrónico: " +getCorreo()+"\n"
		+"Teléfono: " +getTelefono()+"\n";
		
		} else
			return "============DATOS DEL USUARIO============\n\n"
					+"Nombre: " +getNombre()+"\n"
		+"Apellidos: " +getApellidos()+"\n"
		+"DNI: " +getDNI() +"\n"
		+"Correo Electrónico: No se ha registrado el correo electrónico.\n"
		+"Teléfono: No se ha registrado el teléfono.\n";
		
		
		
	}
	
	
}
