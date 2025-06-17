package practices;

// [] . () (llamada a método, acceso a array, acceso a miembro)
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		String s = "Hola";
//		int length = s.length(); // llamada al método
//		char letra = s.charAt(0); // acceso por indice
//		
//		System.out.println(length); // 4
//		System.out.println(letra); // "H"
//	}
//}

// ! ~ ++ -- + (unario) - (unario) (tipo) new
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int x = 5;
//		boolean b = !(x > 0);
//		int y = +x;			// unario positivo
//		int z = -x;			// unario negativo
//		int a = ~5;			// complemento a uno (inversión de bits)
//		int b2 = ++x;		// pre-incremento
//		Object obj = new String("Hola");
//		
//		System.out.println(obj); 
//		
//	}
//}

// * / %
//Multiplicación, división y módulo tienen la misma prioridad.
//
//De izquierda a derecha.
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int resultado = 10 * 2 / 5 % 3;
//		
//		System.out.println(resultado); 
//		
//	}
//}

// + -
// Suma y resta, evaluadas de izquierda a derecha.
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int resultado = 5 + 2 -1;
//		
//		System.out.println(resultado); 
//		
//	}
//}

// << >> >>> (desplazamiento de bits) 
// de izquierda a derecha
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int n = 8; // 1000
//		int derecha = n >> 1; // 0100
//		int sinSigno = n >>> 1;
//		int izquierda = n << 1; // 10000
//		
//		System.out.println(izquierda); 
//	}
//}

// < <= > >= instanceof
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		boolean esMayor = 5 > 3;
//		boolean esInstancia = "Hola" instanceof String;
//		
//		System.out.println(esMayor);
//		System.out.println(esInstancia); 
//	}
//}

// == !=
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		boolean igual = (3 + 2) == 5;
//		boolean distinto = 4 != 5;
//		
//		System.out.println(igual);
//		System.out.println(distinto); 
//	}
//}

// &
// AND bit a bit
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int r = 5 & 3; //  0101 & 0011 = 0001 -> 1
//		
//		System.out.println(r);
//	}
//}

// ^
// XOR bit a bit
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int r = 5 ^ 3; //  0101 & 0011 = 0110 -> 6
//		
//		System.out.println(r);
//	}
//}

// |
// OR bit a bit
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		int r = 5 | 3; //  0101 & 0011 = 0111 -> 7
//		
//		System.out.println(r);
//	}
//}

// &&
// AND lógico
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		boolean res = (5 > 3) && (2 < 4); // true
//		
//		System.out.println(res);
//	}
//}

// OR lógico
//public class PrecedenciaAsociatividadOperadores {
//	public static void main (String[] args) {
//		boolean res = (5 < 3) || (2 < 4); // true
//		
//		System.out.println(res);
//	}
//}

// ?: (operador ternario)
// condición ? valor_si_verdadero : valor_si_falso;
public class PrecedenciaAsociatividadOperadores {
	public static void main (String[] args) {
		int edad = 20;
		String resultado = (edad >= 18) ? "Mayor" : "Menor";
		System.out.println(resultado);
	}
}

