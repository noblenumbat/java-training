package practices;

// Cuenta los intentos fallidos y bloquea después de cierto número

public class LoginSimulator{
	public static void main (String[] args) {
		Counter intentosFallidos = new Counter(); // Marca error porque a la clase se le puso un limite de incremento y necesita un parámetro.
		String passwordCorrecta = "1234";
		String[] intentos = {"1111", "0000", "1234", "5555"}; // Simula intentos de usuario
		
		for (String intento : intentos) {
			if (intento.equals(passwordCorrecta)) {
				if (intentosFallidos.currentCount() == 3) {
					System.out.println("Intenta mañana");
				}else {
					System.out.println("Acceso concedido");
					break;
				}
			} else {
				intentosFallidos.incrementCount();
				System.out.println("Intento fallido #" + intentosFallidos.currentCount());
				if (intentosFallidos.currentCount() >=3 ) {
					System.out.print("Cuenta bloqueada por demasiados intentos fallidos. ");
				}
			}
		}
	}
}