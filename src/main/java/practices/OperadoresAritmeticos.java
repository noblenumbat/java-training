package practices;

public class OperadoresAritmeticos{
	public static void main(String args[]) {
		System.out.println(15/2); // 7
		System.out.println(15%2); // 1
		System.out.println(15.0/2); // 7.5
		
		int x = 3;
		x += 3; // += es un sufijo 
		System.out.println(x); // 6
				
		System.out.println(x*=2);  // 12
		System.out.println(x%3); // 0
		
		int z;
		
		System.out.println(x + 1); // el  resultado no se guarda
		
		z = x;
		
		System.out.println(z++); // post-incremento El valor impreso es 12, no 13 porque el incremento ocurre después de que el valor se pasa a System.out.println() 
		System.out.println(++z); // pre-incremento El valor impreso es 14, porque se incrementa el valor de la variable antes antes ser impresa por System.out.println()
		
		int a;
		
		a = 5;
		
		System.out.println(a--); // 5
		System.out.println(--a); // 3
				
	}
}