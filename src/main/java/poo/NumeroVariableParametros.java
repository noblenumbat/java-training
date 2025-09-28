package poo;

public class NumeroVariableParametros {
	public static void main (String[] args) {
		Double m = max(3.1, 40.4, -5.0); // pasa al método el array new Double[] {3.1, 40.4, -5.0}
		System.out.println(m); // 40.0 valor mayor
		m = max(); // el método puede no recibir ningún parámetro dando origen a un array de cero elementos
		System.out.println(m); // -Infinity
	}
	
	public static Double max(Double... values) {
		Double largest = Double.NEGATIVE_INFINITY;
		for (Double v : values) // v es cada elemento en el conjunto de parámetros que se pasa al método
			if (v > largest) // el blulcle funciona si hay una valor mayor
				largest = v; // se asegura de que largest contenga el valor mayor
		return largest; // cuando ya no se cumple la condición, el valor mayor es retornado
	}
}