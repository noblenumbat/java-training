package practices;

//public class OperadoresDeBits {
//	public static void main (String[] args) {
//		int n = 13; // binario: 1101
//		int cuartoBitPorDerecha = (n & 8) / 8;
//		System.out.println(cuartoBitPorDerecha); // imprime 1
//	}
//}

// Operador de desplazamiento
public class OperadoresDeBits {
	public static void main (String[] args) {
		int a = -1; // binario: 1101
		a = a >>> 24; // 00000000 00000000 00000000 00000000 11111111
		System.out.println(a); // imprime 255
	}
}