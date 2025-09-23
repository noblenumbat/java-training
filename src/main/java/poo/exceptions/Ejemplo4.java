package poo.exceptions;

// Definimos nuestra propia excepción no comprobada
class EdadInvalidaException extends RuntimeException {
	public EdadInvalidaException (String mensaje) {
		super(mensaje); // Guarda el mensaje en RutimeException
	}
}

public class Ejemplo4 {
	public static void verificarEdad(int edad) {
		if (edad < 18) {
			// Lanza la excepción personalizada
			throw new EdadInvalidaException("La edad mínima es 18 años.");
		}
		System.out.println("Edad válida: " + edad);
	}
	
	public static void main(String[] args) {
		try {
			verificarEdad(14); // Provoca la excepción
		} catch (EdadInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

//super(mensaje) llama al constructor de la superclase (RuntimeException).
//
//Ese constructor guarda el mensaje dentro de la excepción.
//
//Más tarde puedes recuperar ese mensaje con getMessage().