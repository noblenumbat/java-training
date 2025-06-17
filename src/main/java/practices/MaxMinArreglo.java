package practices;
import java.util.Arrays;

public class MaxMinArreglo{
	public static void main(String[] args) {
		int[] numeros = {8, 3, 15, 7, 22, 1, 9};
		
//		// Inicializamos max y min con el primer valor del arreglo
//		int max = numeros[0];
//		int min = numeros[0];
//		
//		// Recorremos el arreglo
//		for(int i = 1; i < numeros.length; i++) {
//			max = Math.max(max, numeros[i]);
//			min = Math.min(min, numeros[i]);
//		}
//		System.out.println("Valor máximo: " + max);
//		System.err.println("Valor mínimo: " + min);
		
		// Versión compacta
		
		int max = Arrays.stream(numeros).max().getAsInt();
		int min = Arrays.stream(numeros).min().getAsInt(); 	
		
		System.out.println("Valor máximo: " + max);
		System.err.println("Valor mínimo: " + min);
	}
}