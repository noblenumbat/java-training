package practices;

// Imprime solo los números pares del 1 al 10
public class ContinuePractEvitarNumerosImpares{
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i % 2 != 0) {
				continue; // Provoca que el control se transfiera a la expresión de iteración y después a la expresión condicional. Salta los número impares.  
			}
			System.out.println("Número par: " + i);
		}
	}
}