package poo;

import java.util.Objects;

public class Manager extends Employee {
	private Double incentivo;
	public Manager(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia)
	{
		//Invocar la version heredada del método
		super(nombre,salario,anno,mes,dia);
		this.incentivo = 0.0;
	}
	public Double getIncentivo() {
		return this.incentivo;
	}
	// Se crea un método para asignar y almacenar el valor del incentivo
	public void setIncentivo(Double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public Double getSueldo() {
		Double sueldoBase = super.getSueldo();
		return sueldoBase + this.incentivo;
	}
	@Override
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false;  // llama a equals de la superclase. Si los atributos heredados (nombre, sueldo, fechaContrato) no son iguales, devuelve false.
		                                              // Un Manager no puede ser igual a otro si no coinciden también como Employee.
		Manager other = (Manager) otherObject; // casting a Manager. Se hace downcasting para acceder a los atributos específicos de Manager.
		return Objects.equals(this.incentivo, other.incentivo); // Compara el atributo extra que Manager añade: incentivo
		                                                        // Usa Objects.equals para manejar posibles null sin riesgo de Null PointerException.
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.incentivo);
	}
	
	@Override
	public String toString() {
		return super.toString() + "[Incentivo=" + this.incentivo + ']';
	}
}

//A tener en cuenta:
//
//Si Manager no redefiniera equals y solo heredara el de Employee:
//
//Dos managers con mismos datos de empleado pero distinto incentivo serían considerados iguales, lo cual puede no tener sentido para tu lógica de negocio.
//
//Con esta sobreescritura:
//
//Ahora la igualdad considera también el incentivo.