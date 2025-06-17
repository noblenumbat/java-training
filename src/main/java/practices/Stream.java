package practices;
import java.util.Arrays; // Sumar impares
import java.util.List; // Nombres que empiezan por L

// Sumar pares
//public class Stream{
//	public static void main (String[] args) {
//		int [] numeros = {1, 2, 3, 4, 5, 6};
//		
//		int sumaPares = Arrays.stream(numeros) // Paso los datos por un tubo
//				.filter(n -> n % 2 == 0)
//				.sum();
//		
//		System.out.println(sumaPares);
//	}
//}

//Prueba de conversion de Double a Int
//public class Stream{
//	public static void main (String[] args) {
//		
//		double num1 = 3.5;
//		int num2 = 0;
//		
//		num2 = (int) num1;
//		
//		
//		System.out.println(num2); // 3
//	}
//}

//Prueba de conversion de Int a Double
//public class Stream{
//	public static void main (String[] args) {
//		
//		int num1 = 3;
//		double num2;
//		
//		num2 = (int) num1;
//		
//		
//		System.out.println(num2); // 3.0
//	}
//}

// Nombres que empiezan por L
public class Stream{
	public static void main (String[] args) {
		List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos", "Laura"); // Lista de tamaño fijo respaldada por un array (no add() ni remove())
		
		nombres.stream()
			.filter(nombre -> nombre.startsWith("L"))
			.forEach(System.out::println);
	}
}