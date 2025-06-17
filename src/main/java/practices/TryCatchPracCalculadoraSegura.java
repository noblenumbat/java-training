package practices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPracCalculadoraSegura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		String operacion; // para el switch
		boolean entradaValida = false;
		
		while(!entradaValida) {
			try {
				System.out.println("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				
				System.out.println("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				scanner.nextLine(); // esta parte limpia el buffer
				
				System.out.println("Operación (+, -, *, /): ");
				operacion = scanner.nextLine();
				
				switch(operacion) {
					case "+" : 
						System.out.println("Resultado: " + (num1 + num2));
						break;
					case "-" : 
						System.out.println("Resultado: " + (num1 - num2));
						break;
					case "*" : 
						System.out.println("Resultado: " + (num1 * num2));
						break;
					case "/" : 
						if(num2 == 0) {
							System.out.println("¡Error! No se puede dividir entre cero.");
							continue; // volver a intentar
						}
						System.out.println("Resultado: " + (num1 / num2));
						break;
					default : 
						System.out.println("Operación no reconocida");
						continue;
					
				}
				
				entradaValida =  true; // punto de parada
				
			}catch(InputMismatchException e){
				System.out.println("Entrada invalida. Usa números válidos.");
				scanner.nextLine(); // Limpiar entrada. Esto evita que se repita el mesaje de error.
			}
		}
		scanner.close();
	}
}

