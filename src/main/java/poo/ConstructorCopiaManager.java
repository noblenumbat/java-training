// Archivo de prueba-> TestCopiaConstructor 
package poo;

public class ConstructorCopiaManager extends ConstructorCopiaEmployee {
	private Double incentivo;
	public ConstructorCopiaManager(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia)
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
	public ConstructorCopiaManager (ConstructorCopiaManager manager) {
		super(manager);
		this.incentivo = manager.incentivo;
	}
	@Override
	public Double getSueldo() {
		Double sueldoBase = super.getSueldo();
		return sueldoBase + this.incentivo;
	}
	@Override
	public String toString() {
		return super.toString() + "[Incentivo=" + this.incentivo + ']';
	}
}

