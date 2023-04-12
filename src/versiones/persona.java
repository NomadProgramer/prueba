package versiones;

public class persona {
	
	// esto es una clase de persona
	private String nombre;
	private String apellido;
	public int DNI;
	public String direccion;
	
	
	public persona(String nombre, String apellido, int dNI, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.direccion = direccion;
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


	
	
	


	
	
	
	
	
}
