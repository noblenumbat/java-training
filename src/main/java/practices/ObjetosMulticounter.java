package practices;

public class ObjetosMulticounter {
	public static void main(String[] args) {
		
		// Contador unico para ejecución de métodos en el que cada argumento es una característica de la clase
		MultiCounter contador = new MultiCounter();
		
		System.out.println("MODULO DE CLICS");
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		
		System.out.println(contador.counterCurrentClics()); // 0
		
		contador.counterIncrementClics(); 
		contador.counterIncrementClics(); 
		
		System.out.println(contador.counterCurrentClics()); // 2
		
		contador.counterResetClics();
		
		System.out.println(contador.counterCurrentClics()); // 0
		
		System.out.println("");
		
		System.out.println("MODULO DE ERRORES");
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		
		System.out.println(contador.counterCurrentErrors()); // 0
		
		contador.counterIncrementErrors(); 
		contador.counterIncrementErrors();
		contador.counterIncrementErrors();
		
		System.out.println(contador.counterCurrentErrors()); // 3
		
		contador.counterResetErrors();
		
		System.out.println(contador.counterCurrentErrors()); // 0
		
		// CONCLUSIÓN
		// Las características son independientes. Aunque el objeto contador es el mismo
		// éste ejecuta métodos de la clase principal que afectan a la caracteristica 
		// que se encuentra explicitamente en la función.
		
	}
	
}