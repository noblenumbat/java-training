package poo.exceptions;

public class Ejemplo2 {
	public static void main (String[] args) {
		try {
			int  [] numeros = {1, 2, 3};
			System.out.println(numeros[4]); // Lanza ArrayIndexOutOfBoundsExeption
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: la posición a la que intenta acceder es mayor al tamaño del array");
		}
	}
}