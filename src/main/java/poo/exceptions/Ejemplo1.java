package poo.exceptions;

public class Ejemplo1 {
	public static void main (String[] args) {
		try {
			int a = 40;
			int b = 0;
			int resultado = a / b; // Lanza ArithmeticException
			System.out.println("Resultado" + resultado);
		}
		catch (ArithmeticException e) {
			System.out.println("Error: No se puede dividir entre cero.");
		}
	}
}