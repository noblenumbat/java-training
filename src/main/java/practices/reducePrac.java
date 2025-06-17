package practices;

import java.util.List;

/*
 * Sumar montos de transacciones (reduce())
 * Sumar el total de todas las trasacciones bancarias de un cliente 
 */

public class reducePrac {
	public static void main(String args[]) {
		List<Double> transacciones = List.of(200.0, -50.0, 300.0, -100.0);
		
		double balanceTotal = transacciones.stream()
				.reduce(100.0, Double::sum); // 0.0 es el valor inicial del acumulador
		
		System.out.println("Balance final: " + balanceTotal);
	}
}
 