package practices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPracNumeroPositivo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = -1;
		
		while(numero <=0) {
			try {
				System.out.println("Introduce un número entero positivo");
				numero = scanner.nextInt();
				
				if(numero <=0) {
					System.out.println("Debe ser mayor que cero.");
				}
			} catch (InputMismatchException e) {
				System.out.println("!Error el número no es un número entero!");
				scanner.nextLine(); //Limpiar entrada incorrecta 
			}
			
		}
		System.out.println("!Número válido: " + numero + "!");
		scanner.close();
	}
}