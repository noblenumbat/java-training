package practices;


// OPERADOR ==
/*
public class OperadoresRelacionalesLogicos {
	public static void main (String[] args) {
		int a = 5;
		int b = 5;
		
		if (a == b) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números son diferentes");
		}
	}
}
*/

/*
public class OperadoresRelacionalesLogicos {
	public static void main (String[] args) {
		String texto1 = "Hola";
		String texto2 = "Hola";
		
		if (texto1 == texto2) {
			System.out.println("Las cadenas son iguales (==).");
		} else {
			System.out.println("Las cadenas son diferentes (==).");
		}
	}
}
*/

// !=
/*
public class OperadoresRelacionalesLogicos {
	public static void main (String[] args) {
		String a = "Jhon";
		String b = "jhon"; 
		
		System.out.println(a != b); // true (distingue mayus y minus)
	}
}
*/

// < 
/*
public class OperadoresRelacionalesLogicos {
	public static void main (String[] args]) {
		float num1 = 3.15f;
		float num2 = 3.18f;
		
		System.out.println(num1 < num2); // true
		
	}
}
*/

// >
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		float num1 = 3.15f;
//		float num2 = 3.18f;
//		
//		System.out.println(num1 > num2); // false
//		
//	}
//}

// <=
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		double num1 = 3.15;
//		double num2 = 3.18;
//		
//		System.out.println(num1 <= num2); // true
//		
//	}
//}

// >=
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		double num1 = 3.15;
//		double num2 = 3.18;
//		
//		System.out.println(num1 >= num2); // false
//		
//	}
//}

// &&
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		int num1 = 3;
//		int num2 = 5;
//		
//		if (num1 == 3 && num2 == 5) {
//			System.out.println("(&&) Ambas condiciones se cumplen!"); 
//		}
//	}
//}

// ||
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		String nombre = "Romeo";
//		String apellido = "Castle";
//		
//		if((nombre == "Romeo") || (apellido == "Castillo")) {
//			System.out.println("(||) una de las dos condiciones se cumplen!" + " " + args[0]);
//		}
//	}
//}

// !true -> false   !false -> true

// Negar una condición booleana
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		boolean esMayorDeEdad = false;
//		
//		if (!esMayorDeEdad) {
//			System.out.println("La persona es menor de edad.");
//		} else {
//			System.out.println("La persona es mayor de edad");
//		}
//	}
//}

// Negar el resultado de una comparación
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		int numero = 10;
//		
//		if (!(numero > 20)) {
//			System.out.println("El número NO es mayor que 20.");
//		} else {
//			System.out.println("El número es mayor que 20");
//		}
//	}
//}

// ^ XOR is true when both values aren't equals
// XOR lógico con booleanos
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		boolean tieneLlave = true;
//		boolean tieneCodigo = false;
//		
//		if (tieneLlave ^ tieneCodigo) {
//			System.out.println("Tiene solo uno de los dos accesos: puede entrar.");
//		} else {
//			System.out.println("Debe tener solo uno de los accesos para entrar.");
//		}
//	}
//}

// XOR a nivel de bits (bitwise)
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		int a = 5; // binario: 0101
//		int b = 3; // binario: 0011
//		
//		int resultado = a ^ b;
//		
//		System.out.println("Resultado: " + resultado); // 6 (binario 0110)
//	}
//}

// &&
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		String nombre = "Romeo"; 
//		String apellido = "Castle"; 
//		
//		if (nombre == "Romeo" && apellido == "Castle") {
//			System.out.println("Es la mascota de Jonathan!");
//		} else {
//			System.out.println("Es otro perro!");
//		}
//	}
//}

// ||
//public class OperadoresRelacionalesLogicos {
//	public static void main (String[] args) {
//		float peso = 1.5f; 
//		String color = "Negro"; 
//		
//		if (peso <= 2 || color == "Blanco") {
//			System.out.println("Es raza pincher");
//		} else {
//			System.out.println("Es otra raza");
//		}
//	}
//}

// ? operador ternario
public class OperadoresRelacionalesLogicos {
	public static void main (String[] args) {
		int x = 10;
		int y = 7;
		int z = x < y ? x : y;
		
		System.out.println(z); // 7
	}
}




