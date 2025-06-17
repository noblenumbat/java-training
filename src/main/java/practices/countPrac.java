package practices;

import java.util.List;


public class countPrac {
	public static void main (String args[]) {
		
		List<Double> precios = List.of(90.0, 150.0, 45.0, 120.0, 200.0);
		
		long conteo = precios.stream()
				.filter(precio -> precio > 100)
				.count();
		
		System.out.println("Productos > $100: " + conteo);
		
	}
}