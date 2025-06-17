package practices;

import java.util.Scanner;

// DIFERENTE TIPOS DE ENTRADA

// in.next() Lee sola la primera palabra
// in.nextLine() Le todas palabras incluyendo espacios
public class InputsPract {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Escribe tu nombre y apellido (sólo te mostraré el nombre): ");
//		String unaPalabra =  in.next();
//		System.out.println(unaPalabra);
//		
//		in.nextLine(); // Limpiando el salto de linea
//		
//		System.out.println("Escribe tu nombre y apellido (te mostraré el nombre y apellido): ");
//		String todasLasPalabras =  in.nextLine();
//		System.out.println(todasLasPalabras);
		
//		System.out.println("Dime tu edad: ");
//		int edad = in.nextInt();
//		System.out.println("Tienes " + edad + " años");
		
		System.out.println("Dime tu peso: ");
		Double peso = in.nextDouble();
		System.out.println("Tu peso es " + peso + " kg");
		
		
		
	}
}
