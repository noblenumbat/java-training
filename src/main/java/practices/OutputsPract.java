package practices;

public class OutputsPract {
	public static void main (String[] args) {
		double x = 10000.00 / 3.0;
		
		System.out.println(x); // 3333.3333333333335
		System.out.printf("%8.2f", x); //  3333,33 anchura de campo de ocho caracteres y una precisión de dos cifras
		
		String name = "Joe";
		int age = 20;
		
		System.out.println("");
		
		System.out.printf("Hola %s tu tienes %d años", name, age); // Hola Joe tu tienes 20 años
		
		System.out.println("");
		
		System.out.printf("%,.3f", 4008 * 2.5); // Modificador
	}
}