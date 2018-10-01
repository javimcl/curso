import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Javier Lucero
 *
 */
public class Persona {
	
	private String documento;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Persona() {
		super();		
	}
	public Persona(String documento, String nombre, String apellido,
			LocalDate fechaNacimiento) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	
	}
	
	public long getEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).get(ChronoUnit.YEARS);
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [documento=" + documento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
}
