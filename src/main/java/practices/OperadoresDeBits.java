package practices;

public class OperadoresDeBits {
	public static void main (String[] args) {
		int n = 13; // binario: 1101
		int cuartoBitPorDerecha = (n & 8) / 8; // 8 / 8 = 1
		System.out.println(cuartoBitPorDerecha); // imprime 1
	}
}

/*
 n = 1101
 &
 8 = 1000
 (n&) = 1000 => decimal 8
 * */




// Operador de desplazamiento sin signo
//public class OperadoresDeBits {
//	public static void main (String[] args) {
//		int a = -1; // 		binario: 	11111111 11111111 11111111 11111111
//		a = a >>> 24; // 	binario:	00000000 00000000 00000000 11111111
//		// operador sin signo >>> 24  
//		System.out.println(a); // imprime 255
//	}
//}

//
//public class OperadoresDeBits {
//	public static void main (String[] args) {
//		int a = -1; // 		binario: 	11111111 11111111 11111111 11111111
//		a = a >> 24; // 	binario:	11111111 11111111 11111111 11111111
//		// operador >> mantiene el big de signo, es decir 1. Rellena con unos por la izquierda 
//		System.out.println(a); // imprime -1
//	}
//}