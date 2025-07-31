package practices;
import java.util.ArrayList;
import java.util.Arrays;

public class StringsPrac {
	public static void main(String args []) {
		String gretting = "Hello";
		String goodbye = "hello";
		int l = gretting.length(); 			// 5 
		char first = gretting.charAt(0); 	// H
		char last = gretting.charAt(4); 	// o 
		
		String s = gretting.substring(0,3); // Hel
		String m = gretting.substring(0,2); // He
		
		// System.out.println(m + "-y"); 	// He-y
		System.out.println(first+l); 		// 77 Internamente en Unicode H tiene un valor de 72
		System.out.println(gretting+l); 	// Hello5
		
		System.out.println(gretting.equals(goodbye)); // false
		System.out.println(gretting.equalsIgnoreCase(goodbye)); // true
		
		
		int[] numeros;
		numeros = new int[5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 20;
		numeros[3] = 30;
		numeros[4] = 40;
		
// VERSION CONVIRTIENDO UN ARRAY A UNA LISTA PARA USAR EL MÉTODO add()			
//		ArrayList<Integer> numAgrupados = new ArrayList<>(); // No existe un método add() en arrays
//		
//		for(int n = 0; n < numeros.length; n++) {
//			numAgrupados.add(numeros[n]); 
//		}
//		
//		String convToString = numAgrupados.toString();
//		System.out.println(convToString);
//		System.out.println(numeros.getClass());
		
// VERSION USANDO MERAMENTE ARRAYS
		int[] numAgrupados = new int[numeros.length];
		
		for(int n = 0; n < numeros.length; n++) {
			numAgrupados[n] = numeros[n]; 
		}
		
		String convToString = numAgrupados.toString();
		//System.out.println(convToString); // [I@13221655
		System.out.println(Arrays.toString(numAgrupados)); // [10, 20, 20, 30, 40]
		//System.out.println(numeros.getClass());
	}
}