package poo;

import java.util.Arrays;

public class Arreglos {
	public static void main (String[] args) {
		int[] bets = new int[5];
		System.out.println(bets.length);
		bets[3] = 615;
		System.out.println(bets[3]);
		
		Integer[] array = {5, 7, 9, 13, 15};
		System.out.println(array.length);
		
		System.out.println();
		
		System.out.println("Este es un foreach, el cual recorre cada elemento del array: ");
		for(Integer i : array)
			System.out.println(i);
		
		System.out.println();
		
		System.out.println("Este es un for tradicional, el cual recorre cada indice del array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		System.out.println("METODOS PARA COPIA DE ARRAYS");
		
		System.out.println();
		
		System.out.println("************** System.arraycopy() **************");
		
		System.out.println();
		
		System.out.println("Copia completa de un array en otro array");
		
		int[] arrayOrigen = {23, 43, 55};
		int[] arrayDestino = new int[3]; // Tamaño fijo
		
		System.arraycopy(arrayOrigen, 0, arrayDestino, 0, 3); // El último argumento es la cantidad de elementos a copiar
		
		for (Integer ad : arrayDestino)
			System.out.println(ad);
		
		System.out.println();
		
		System.out.println("Mostrando un array sin usar un bucle");
		System.out.println(java.util.Arrays.toString(arrayDestino));
		
		System.out.println();
		
		System.out.println("Copia de una subsecuencia de un array a otro");
		
		int[] arrayOrigen1 = {23, 43, 55, 12, 65, 88, 92};
		int[] arrayDestino1 = new int [3];
		// Integer[] arrayDestino1 = null; // Lanza un NullPointerException  
		System.arraycopy(arrayOrigen1, 2, arrayDestino1, 0, 3); // 55, 12, 65, 23, 43, 55, 12, 65, 88, 92
		
		for (int ad1 : arrayDestino1)
			System.out.println(ad1);
		
		System.out.println();
		System.out.println("Mostrando un array sin necesidad de usar un bucle");
		System.out.println(java.util.Arrays.toString(arrayDestino1));
		
		System.out.println();
		
		System.out.println("************** copyOf() **************");
		
		System.out.println();
		
		int[] array1 = {23, 43, 55, 12};
		int newLength = array.length -1;
		int[] copiedArray = Arrays.copyOf(array1, newLength);
		System.out.println(Arrays.toString(copiedArray));	
		
		// Como rellenan los espacios sobrantes:
		// numeros -> 0
		// boolean -> false
		// objetos de tipo referencia -> null
		
//		System.out.println("Uso de copyOf() para incrementar el tamaño de un array");
//		
//		int[] array2 = {23, 43, 55, 12};
//		int newLength1 = array2.length;
//		int[] copiedArray1 = Arrays.copyOf(array2, 3 * newLength1); // [23, 43, 55, 12, 0, 0, 0, 0, 0, 0, 0, 0]
//		System.out.println(Arrays.toString(copiedArray1)); 
		
		int[] array2 = {23, 43, 55, 12};
		int[] copiedArray1 = Arrays.copyOf(array2, 3 * array2.length); // [23, 43, 55, 12, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(copiedArray1)); 
	}
}