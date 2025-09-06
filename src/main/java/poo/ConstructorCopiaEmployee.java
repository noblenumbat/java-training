// Archivo de prueba-> TestCopiaConstructor 
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class ConstructorCopiaEmployee {
	private final String nombre; 
	private Double sueldo;
	private Date fechaContrato;
	
	// Constructor normal
	public ConstructorCopiaEmployee(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia)
	{
		this.nombre = nombre;
		this.sueldo = salario;
		GregorianCalendar calendario = new GregorianCalendar(anno, mes -1, dia);
		this.fechaContrato = calendario.getTime();
	}
	
	public void setFechaContrato(Date fecha) {
		this.fechaContrato = new Date(fecha.getTime());
	}
	public Double getSueldo() {
		return this.sueldo;
	}
	// Constructor de copia
	public ConstructorCopiaEmployee (ConstructorCopiaEmployee other) {
		this.nombre = other.nombre;
		this.sueldo = other.sueldo;
		this.fechaContrato = new Date(other.fechaContrato.getTime());
	}
	@Override
	public String toString() {
		return getClass().getName() + 
				"[nombre=" + this.nombre + 
				", sueldo=" + this.sueldo + 
				", fechaContrato=" + this.fechaContrato + "]";
	}
	
}