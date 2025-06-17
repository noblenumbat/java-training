package practices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPracMenuInteractivo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion = -1;
		
		while(true) {
			System.out.println("\nMENÚ:");
			System.out.println("1. Saludar");
			System.out.println("2. Mostrar la fecha actual");
			System.out.println("0. Salir");
			System.out.println("Selecciona una opción: ");
			
			try {
				opcion = scanner.nextInt();
				scanner.nextLine(); // limpia salto de linea
				
				switch (opcion) {
					case 1 :
						System.out.println("How is going!");
						break;
					case 2 :
						System.out.println("The current date is : " + java.time.LocalDate.now());
						break;
					case 0 :
						System.out.println("Exiting, see you soon!");
						scanner.close(); // liberando recursos
						return;
					default:
						System.out.println("¡Choose a valid option!");
						
				}	 
						
			}catch (InputMismatchException e){
				System.out.println("Insert a integer valid number");
				scanner.nextLine();
			}
			// Aquí no se cierra el objeto scanner porque se necesita para una ejecución del bucle cuando sucede la entrada de excepción de error
		}
	}
}