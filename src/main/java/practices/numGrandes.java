package practices;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;


// NIVEL 1: Iniciación
// Ejercicio 1: sumando dos números enteros grandes

//public class numGrandes {
//	public static void main(String args []) {
//		BigInteger num1 = BigInteger.valueOf(750);
//		BigInteger num2 = BigInteger.valueOf(250);
//		
//		BigInteger ans = num1.add(num2);
//		
//		System.out.println(ans);
//	}
//}


// Ejercicio 2: resta entre dos números enteros grandes
//public class numGrandes {
//	public static void main(String args []) {
//		BigInteger num1 = BigInteger.valueOf(750);
//		BigInteger num2 = BigInteger.valueOf(250);
//		
//		BigInteger ans = num1.subtract(num2);
//		
//		System.out.println(ans);
//	}
//}


// Ejercicio 3: mulplicando dos numeros enteros grandes
//public class numGrandes {
//	public static void main(String args []) {
//		BigInteger num1 = BigInteger.valueOf(750);
//		BigInteger num2 = BigInteger.valueOf(250);
//		
//		BigInteger ans = num1.multiply(num2);
//		
//		System.out.println(ans);
//	}
//}


// Ejercicio 4: División decimal
// Divide 100.0 entre 3.0 usando BigDecimal. Aplica redondeo con RoundingMode.HALF_UP a dos decimales.

//public class numGrandes {
//	public static void main(String args []) {
//		BigDecimal num1 = BigDecimal.valueOf(100.0);
//		BigDecimal num2 = BigDecimal.valueOf(3.0);
//		
//		BigDecimal ans = num1.divide(num2, 2, RoundingMode.HALF_UP);
//				
//		System.out.println(ans);
//	}
//}


// NIVEL 2: Operaciones combinadas y comparación

// Comparación de enteros grandes
// Declara tres valores con BigInteger. Compara el primero con el 
// segundo y luego con el tercero usando compareTo(). 
// Imprime mensajes según el resultado.

// cero representa al segundo número o expresión que participa en la comparación
// public class numGrandes {
//	public static void main(String args []) {
//		
//		BigInteger a = BigInteger.valueOf(100);
//		BigInteger b = BigInteger.valueOf(80);
//		BigInteger c = BigInteger.valueOf(120);
//		
//		if (a.compareTo(b) > 0) System.out.println(a + " es mayor que " + b);
//		else if(a.compareTo(b) < 0) System.out.println(a + "es menor que " + b);
//		else System.out.println("Los números son iguales");	
//		
//		if(a.compareTo(c) > 0) System.out.println(a + "es mayor que " + c);
//		else if(a.compareTo(c) < 0) System.out.println(a + " es menor que " + c);
//		else System.out.println("Los números son iguales");	
//		
//	}
//}


// Expresión compuesta con enteros

//public class numGrandes {
//	public static void main(String args []) {
//		
//		BigInteger a = BigInteger.valueOf(100);
//		BigInteger b = BigInteger.valueOf(80);
//		BigInteger c = BigInteger.valueOf(120);
//		BigInteger d = BigInteger.valueOf(400);
//		
//		BigInteger ans = (a.add(b)).multiply((c.subtract(d))); 
//		
//		System.out.println(ans);
//	}
//}


// Expresión compuesta con decimales
//Declara los valores x, y, z como BigDecimal y evalúa la expresión:
//(x * y) / z
//Usa RoundingMode.HALF_UP y redondea a 4 decimales.

//public class numGrandes {
//	public static void main (String [] args) {
//		BigDecimal x = BigDecimal.valueOf(30.0);
//		BigDecimal y = BigDecimal.valueOf(2.0);
//		BigDecimal z = BigDecimal.valueOf(7.0);
//		
//		BigDecimal ans = (x.multiply(y)).divide(z, 4, RoundingMode.HALF_UP);
//		
//		System.out.println(ans);
//	}
//}


// Conversion y uso de valueOf()
//Convierte un número double y un número long a BigDecimal y BigInteger respectivamene 
//usando valueOf(). Muestra valores convertidos.

//public class numGrandes {
//	public static void main (String [] args) {
//		double numDouble = 10.3333;
//		long numLong = 1046576;
//		
//		BigDecimal conv1 = BigDecimal.valueOf(numDouble);
//		BigInteger conv2 = BigInteger.valueOf(numLong);
//		
//		System.out.println(numDouble + " convertido a BigDecimal tipo de dato: " + conv1.getClass());
//		System.out.println();
//		System.out.println(numLong + " convertido a BigInteger tipo de dato: " + conv2.getClass());
//		
//	}
//}


// NIVEL 3: Aplicación práctica
// 3.1. Cálculo de intereses simples
// Supón un capital de $12,000 y una tasa de interés anual del 3.5%.
// Utiliza BigDecimal para calcular los intereses ganados en un año. Redondea el resultado a dos decimales.

//public class numGrandes {
//	public static void main(String args[]) {
//		BigDecimal capital = BigDecimal.valueOf(12000);
//		BigDecimal tasa = BigDecimal.valueOf(0.035);
//		BigDecimal year = BigDecimal.valueOf(2);
//				
//		// el método multiply de la clase BigDecimal no acepta múltiples argumentos
//		BigDecimal calculo = capital.multiply(tasa);
//		
//		BigDecimal interesAnual = calculo.multiply(year).setScale(2, RoundingMode.HALF_UP);
//		// Los otros dos argumentos (2, RoundingMode.HALF_UP) se usan con el método setScale(), no con multiply().		
//		
//		System.out.println(interesAnual);
//	}
//}


// Factorial con BigInteger
// Calcula el factorial de 30 utilizando un bucle for y BigInteger.

//public class numGrandes {
//	public static void main(String args []) {
//		
//		int n = 30;
//		BigInteger factorial = BigInteger.ONE; // No sabia como se inicializaba una variable BigInteger
//				
//		for(int i = 2; i <= n; i++) {
//			factorial = factorial.multiply(BigInteger.valueOf(i)); // No sabia que se podia asignar un valor BigInteger como argumento en multiply()
//		}
//		System.out.println("El factorial de n es : " + factorial);
//	}
//}


// Diferencia entre punto flotante y BigDecimal
// Muestra la diferencia entre el resultado de 2.0 - 1.1 usando double y usando BigDecimal. Reflexiona sobre el resultado.

//public class numGrandes {
//	public static void main (String args[]) {
//		
//		double a = 2.0;
//		double b = 1.1;
//		
//		BigDecimal c = BigDecimal.valueOf(a);
//		BigDecimal d = BigDecimal.valueOf(b);
//		
//		double restaDouble = a - b;
//		BigDecimal restaBigDecimal = c.subtract(d);
//		
//		System.out.println("Resultado de la resta double entre " + a + " y " + b + ": " + restaDouble);
//		System.out.println("");
//		System.out.println("Resultado de la resta BigDecimal entre " + c + " y " + d + ": " + restaBigDecimal);
//
//	}
//}


// Multiplicación encadenada
// Declara tres valores como BigInteger : a, b, c.
// Calcula resultado = a * (b+c)
// Imprime el valor final.

//public class numGrandes {
//	public static void main (String args[]) {
//		BigInteger a = BigInteger.valueOf(10);
//		BigInteger b = BigInteger.valueOf(3);
//		BigInteger c = BigInteger.valueOf(5);
//		
//		BigInteger resultado = a.multiply(b.add(c));
//		
//		System.out.println(resultado);
//		
//	}
//}


// NIVEL 4: Reto avanzado
// Conversión de moneda

// Simula una aplicación bancaria que convierte euros a dólares usando una tasa decimal muy precisa.
// Ejemplo: 1 euro = 1.087654 dólares.
// Calcula cuántos dólares recibirías por 2,345.89 euros. Usa BigDecimal y RoundigMode.HALF_UP.

//public class numGrandes {
//	public static void main (String args[]) {
//		
//		BigDecimal euro = BigDecimal.valueOf(1.087654);
//		BigDecimal euroIncome = BigDecimal.valueOf(2345.89);
//		BigDecimal euroToDolar = euroIncome.multiply(euro).setScale(2, RoundingMode.HALF_UP); 
//		System.out.println("Tengo " + euroIncome + " euros que en dólares es: " + euroToDolar + " USD.");
//		
//	}
//}


// Otra versión del ejemplo anterior añadiendo cadenas a los valores de BigDecimal para que no sean tratados como double

//public class numGrandes {
//	public static void main (String args[]) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		BigDecimal dolar = new BigDecimal("1.087654");
//		//BigDecimal euroIncome = new BigDecimal("2345.89");
//		
//		boolean entradaValida = false;
//		
//		while(!entradaValida) {
//			
//			try {
//				System.out.println();
//				System.out.println("Cuantos Euros quieres cambiar: ");
//				BigDecimal euroIncome = scanner.nextBigDecimal();
//				BigDecimal limite = new BigDecimal("0");
//				scanner.nextLine();
//				
//				System.out.println("");
//				
//				if(euroIncome.compareTo(limite) <= 0) {
//					System.out.println("Ingresa almenos 1€");
//				}else {
//					
//					System.out.println("Por el monto de " + euroIncome + "€");
//					
//					BigDecimal euroToDolar = euroIncome.multiply(dolar).setScale(2, RoundingMode.HALF_UP); 
//					//System.out.println("Tengo " + euroIncome + " euros que en dólares es: " + euroToDolar + " USD.");
//					
//					System.out.println("");
//					
//					System.out.println("Recibiras " + euroToDolar + "USD");
//				}
//				
//			}catch(InputMismatchException e){
//				System.out.println("Solo se admiten valores numéricos");
//				scanner.nextLine();
//			}
//		}
//		scanner.close();
//	}
//}

// Cálculo compuesto de intereses

//P * (1+r/n) nt - P
// DONDE:
// P es el principal o el depósito original en la cuenta bancaria.
// r es la tasa de interés anual.
// t es el número de años.
// n es el número de veces que se capitaliza el interés en un año.
// Otra fórmula común es: CF = CI(1+i)^n, donde CF es el capital final, CI es el capital inicial, i es la tasa de interés y n es el plazo o número de periodos.
//

// Simula un ahorro que mensualmente crece con una tasa del 0.4% durante 12 meses.
// Utiliza BigDecimal y una estructura de repetición. Redondea a dos decimales cada mes.

public class numGrandes {
	public static void main (String args []) {
		
		BigDecimal capital = BigDecimal.valueOf(500000);
		BigDecimal interest = BigDecimal.valueOf(1.004);
		BigDecimal months = BigDecimal.ONE;
		BigDecimal i = BigDecimal.valueOf(1);
		BigDecimal limit = BigDecimal.valueOf(12);	
		System.out.println("Extracto año 2024");
		System.out.println("");
				
		
		while (months.compareTo(limit) <= 0) { // El cero es un simbolo para poder usar el método compareTo
			
			capital = capital.multiply(interest);
			
			
			String mesNombre = "";
			
			switch (months.intValue()) {
				case 1: mesNombre = "Enero"; break;
				case 2: mesNombre = "Febrero"; break;
				case 3: mesNombre = "Marzo"; break;
				case 4: mesNombre = "Abril"; break;
				case 5: mesNombre = "Mayo"; break;
				case 6: mesNombre = "Junio"; break;
				case 7: mesNombre = "Julio"; break;
				case 8: mesNombre = "Agosto"; break;
				case 9: mesNombre = "Septiembre"; break;
				case 10: mesNombre = "Octubre"; break;
				case 11: mesNombre = "Noviembre"; break;
				case 12: mesNombre = "Diciembre"; break;
				default: mesNombre = "Mes deconocido"; 
			}
						
			System.out.println("Mes " + mesNombre + " " + "$" + capital.setScale(2, RoundingMode.HALF_UP));
			months = months.add(i);
			
		}
		
	}
}
