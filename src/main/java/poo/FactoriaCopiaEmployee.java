// NOTA: El método de factoria de copia necesita crear su propio constructor (ver linea 23)

// Archivo de prueba-> TestFactoriaCopia
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class FactoriaCopiaEmployee {
	private final String nombre; 
	private Double sueldo;
	private Date fechaContrato;
	
	// Constructor normal
	public FactoriaCopiaEmployee(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia)
	{
		this.nombre = nombre;
		this.sueldo = salario;
		GregorianCalendar calendario = new GregorianCalendar(anno, mes -1, dia);
		this.fechaContrato = calendario.getTime();
	}
	
	// Constructor de copia
	public FactoriaCopiaEmployee(FactoriaCopiaEmployee other) {
	    this.nombre = other.nombre;
	    this.sueldo = other.sueldo;
	    this.fechaContrato = new Date(other.fechaContrato.getTime()); // deep copy
	}

	public void setFechaContrato(Date fecha) {
		this.fechaContrato = new Date(fecha.getTime());
	}
	public Double getSueldo() {
		return this.sueldo;
	}
	// Factoria de copia
	public static FactoriaCopiaEmployee newInstance (FactoriaCopiaEmployee employee) {
		return new FactoriaCopiaEmployee(employee);
	}
	@Override
	public String toString() {
		return getClass().getName() + 
				"[nombre=" + this.nombre + 
				", sueldo=" + this.sueldo + 
				", fechaContrato=" + this.fechaContrato + "]";
	}
	
}