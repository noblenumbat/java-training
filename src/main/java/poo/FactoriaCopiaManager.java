// NOTA: El método de factoria de copia necesita crear su propio constructor (ver linea 22)

// Archivo de prueba-> TestFactoriaCopia
package poo;

public class FactoriaCopiaManager extends FactoriaCopiaEmployee {
	private Double incentivo;
	public FactoriaCopiaManager(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia)
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
	// Constructor de copia
	public FactoriaCopiaManager (FactoriaCopiaManager other) {
		super(other);
		this.incentivo = other.incentivo;
	}
	// Factoria de copia
	public static FactoriaCopiaManager newInstance (FactoriaCopiaManager manager) {
		return new FactoriaCopiaManager (manager);
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

