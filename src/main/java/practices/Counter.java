package practices;

/*
 * INSTANCIAS:
 * 	TransaccionesDia
 * 	BotonSimulado
 * 	LoginSimulator
 *  VisitasPagina
 */

/**
 * Esta clase representa un contador simple.
 * @author Castle
 */


public class Counter {
    private Integer count;

    public Counter() {
        this.count = 0;
    }

    public Integer currentCount() {
        return this.count;
    }

    public void incrementCount() {
        this.count = this.count + 1;
    }

    public void reset() {
        this.count = 0;
    }
}


// Counter modified 
//public class Counter{
//	private int count;
//	private int maxLimit;
//	
//	/**
//	 * Inicializa el contador en cero.
//	 */
//	public Counter(int maxLimit) {
//		this.count = 0;
//		this.maxLimit = maxLimit;
//	}
//	
//	/**
//	 * Retorna el valor actual del contador.
//	 * @return el valor actual
//	 */
//	public Integer currentCount() {
//		return this.count;
//	}
//	/**
//	 * Incrementa el contador en una unidad.
//	 */
//	public boolean incrementCount() {
//		if(count < maxLimit) {
//			count++;
//			return true; // Incremento exitoso
//		} else {
//			System.out.println("¡Limite de transacciones alcanzado! Máximo permitido: " + maxLimit);
//			return false; // Incremento fallido
//		}
//		
//	}
//	/**
//	 * Reinicia el contador a cero.
//	 */
//	public void reset() {
//		count = 0;
//	}
//}
