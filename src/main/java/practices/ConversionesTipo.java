package practices;

/*
 * El rango de tipo de byte es 256
 * 
 * 
 * */

public class ConversionesTipo{
	public static void main(String args[]) {
		int a;
		byte b;
		
		a = 50000; // entero de 32 bits
		
		b = (byte) a; // tipo de 8 bits
		
		/*
		 * 50000 -> 0000 0000 0000 0000 1100 0011 0101 0000
		 * 8 bits menos significativos de la derecha -> 0101 0000
		 * 0101 0000 en decimal es -> 80

		 * */
		
		System.out.println(b); // 80
	}
}
