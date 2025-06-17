package practices;

/**
 * Esta clase representa un contador simple.
 * @author Jonathan Castillo 
 */

public class Counter{
	private Integer count;
	
	/**
	 * Inicializa el contador en cero.
	 */
	public Counter() {
		this.count = 0; 
	}
	/**
	 * Retorna el valor actual del contador.
	 * @return el valor actual
	 */
	public Integer currentCount() {
		return this.count;
	}
	/**
	 * Incrementa el contador en una unidad.
	 */
	public void incrementCount() {
		this.count = this.count + 1;
	}
	/**
	 * Reinicia el contador a cero.
	 */
	public void reset() {
		this.count = 0;
	}
}
