package poo;

import java.util.Date;
import java.util.GregorianCalendar; // Subclase concreta de Calendar que provee sistema de calendario estándar

public class Employee {
	private final String nombre;
	private Double sueldo; 
	private final Date fechaContrato;
	// Método publico con parámetros 
	public Employee(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia)
	{	// Asociando parámetros con el constructor del método
		this.nombre = nombre;
		this.sueldo = salario;
		// Se crea un objeto de la clase GregorianCalendar al que se le pasan como argumentos los parámetros del método Employee
		GregorianCalendar calendario = new GregorianCalendar(anno, mes - 1, dia);
		this.fechaContrato = calendario.getTime(); // Guarda la fecha del contrato en una variable de referencia que apunta al objeto calendario
	}
	// De aquí en adelante estas son las interfaces de la clase
	public String getNombre() {
		return this.nombre;
	}
	public Double getSueldo() {
		return this.sueldo;
	}
	
	public Date getFechaContrato() {
		// Se retorna así en lugar de this.fechaContrato para evitar problemas de encapsulamiento
		// y proteger la integridad del objeto interno
		// Con new Date(this.fechaContrato.getTime())
		// Se crea un nuevo objeto Date con el mismo tiempo, así que el código externo recibe una copia
		// Si hiciera esto return this.fechaContrato estaría retornando la referencia al objeto original
		// Eso significa que el código que reciba ese objeto puede modificarlo así:
		// empleado.getFechaContrato().setTime(otraFecha.getTime());
		return new Date(this.fechaContrato.getTime());
	}
	public void subirSueldo(Double porcentaje) {
		Double aumento = this.sueldo * porcentaje / 100; // 100000 * 15 = 1500000 / 100 = 15000
		this.sueldo += aumento; // 115000
	}
}
