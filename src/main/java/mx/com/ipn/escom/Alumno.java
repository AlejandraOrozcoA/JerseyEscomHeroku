package mx.com.ipn.escom;

public class Alumno {

	private int numeroBoleta;
	private String nombre;
	private String apellido;
	private String carrera;
	private String correo;
	
	public Alumno () {
		
	}
	

	public Alumno(int numeroBoleta, String nombre, String apellido, String correo) {
		
		this.numeroBoleta = numeroBoleta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public int getNumeroBoleta() {
		return numeroBoleta;
	}

	public void setNumeroBoleta(int numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
