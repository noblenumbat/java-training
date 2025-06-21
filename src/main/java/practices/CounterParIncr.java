package practices;

/*
 * INSTANCIAS:
 * 	IncrContador
 * */
public class CounterParIncr{
	private Integer count;
	
	// Constructor incializa el contador en 0
	public CounterParIncr() {
		this.count = 0;
	}
	
	// Método para obtener el valor actual del contador
	public Integer currentCount() {
		return this.count;
	}
	
	// Método para incrementar el contador por un valor especificado
	public void incrementCount(Integer incrementValue) {
		if (incrementValue > 0) { // Asegurarse de que el incremento sea positivo
			this.count = this.count + incrementValue;
		}else {
			System.out.println("El valor de incremento debe ser positivo. ");
		}
	}
	
	// Método para resetear el contador a 0
	public void reset() {
		this.count = 0;
	}
}