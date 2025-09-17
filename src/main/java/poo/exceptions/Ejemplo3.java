package poo.exceptions;

public class Ejemplo3 {
	public static void main (String[] args) {
		try {
			String texto = "qwerty";
			Integer numero = Integer.parseInt(texto);
			System.out.println(numero); // Lanza NumberFormatException
		}
		catch (NumberFormatException e) {
			System.out.println("Error: no se puede convertir string a integer");
		}
	}
}