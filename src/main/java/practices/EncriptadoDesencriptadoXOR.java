package practices;

/*
 * XOR tiene esta propiedad (A ^ clave) ^ clave = A
 * como si al aplicar la clave dos veces, se "anulara" el cifrado
 * */

public class EncriptadoDesencriptadoXOR {
	public static void main (String[] args) {
		String mensajeOriginal = "Paprika"; 
		int clave = 002; // Clave secreta para encriptar y desencriptar
		
		// Encriptar
		String mensajeEncriptado = encriptarConXOR(mensajeOriginal, clave);
		System.out.println("Mensaje encriptado: " + mensajeEncriptado);
		
		// Desencriptar
		String mensajeDesencriptado = encriptarConXOR(mensajeEncriptado, clave);
		System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);
	}
	
	// Método que encripta o desencripta usando XOR
	public static String encriptarConXOR(String texto, int clave) {
		StringBuilder resultado = new StringBuilder();
		
		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			char encriptado = (char)(caracter ^ clave); // XOR
			resultado.append(encriptado);
		}
		
		return resultado.toString();
	}
}

