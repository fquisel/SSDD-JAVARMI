public class Contacto {
    Contacto siguiente;
	
	private String nombre;
    private String apellido;
    private String email;
    private String numeroTelefonico;
	
	public Contacto(String nombre, String apellido, String email, String numeroTelefonico){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.numeroTelefonico = numeroTelefonico;
	}
	public Contacto getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Contacto siguiente) {
		this.siguiente = siguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
}