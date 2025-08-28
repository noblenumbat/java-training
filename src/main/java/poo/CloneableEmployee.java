package poo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

// TestClone (ejercicio para probar esta clase).

public class CloneableEmployee implements Cloneable {
	private final String nombre; // por qué nombre es el único atributo en final?
	// "nombre" es final porque representa un entidad inmutable del empleado.
	// Una vez asignado en el constructor, no debe cambiarse (ej: como una "Cédula").
	// En cambio, sueldo y fechaContrato sí pueden variar, por eso no son final.
	private Double sueldo;
	private Date fechaContrato;
	
	// El constructor NO termina con ";" porque en Java
	// las definiciones de métodos y constructores se cierran con llaves
	// y no con punto y coma. El ";" se usa solo en sentencias dentro del cuerpo. 
	public CloneableEmployee(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia) // por qué no termina con ";"
	{
		this.nombre = nombre;
		this.sueldo = salario;
		GregorianCalendar calendario = new GregorianCalendar(anno, mes -1, dia);
		this.fechaContrato = calendario.getTime();
	}
	public String getNombre() {
		return this.nombre;
	}
	public Double getSueldo() {
		return this.sueldo;
	}
	public Date getFechaContrato() {
		// Se devuelve una COPIA del Date (defensive copy);
		// para evitar que desde afuera se pueda modificar la fechaContrato real.
		return new Date(this.fechaContrato.getTime());
	}
	public void setFechaContrato(Date fecha) {
		// Método para modificar la fecha en el clon
		this.fechaContrato = new Date(fecha.getTime());
	}
	public void subirSueldo(Double porcentaje) {
		Double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}
	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) return true;
		if (otherObject == null) return false;
		if (this.getClass() != otherObject.getClass()) return false;
		CloneableEmployee other = (CloneableEmployee) otherObject;
		return Objects.equals(this.nombre, other.nombre) &&
				Objects.equals(this.sueldo, other.sueldo) &&
				Objects.equals(this.fechaContrato, other.fechaContrato);
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.nombre, this.sueldo, this.fechaContrato);
	}
	@Override
	public String toString() {
		return getClass().getName() + "[nombre=" + this.nombre + ", sueldo=" + this.sueldo + ", fechaContrato=" + this.fechaContrato + "]";
	}
	@Override
	public CloneableEmployee clone() throws CloneNotSupportedException {
		// Aquí se hace un clon "superficial" con super.clone(),
		// que copia los atributos por referencia (shallow copy).
		CloneableEmployee cloned = (CloneableEmployee) super.clone();
		
		// Como fechaContrato es mutable (Date), aquí se clona explícitamente 
		// para que el nuevo objeto tenga su propia (deep copy parcial).
		cloned.fechaContrato = (Date) this.fechaContrato.clone();
		return cloned;
	}
}