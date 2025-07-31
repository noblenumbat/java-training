package poo;

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
}