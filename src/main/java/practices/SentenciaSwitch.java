package practices;
import java.util.Scanner;
import java.util.InputMismatchException;

// Switch clásico
//public class SentenciaSwitch {
//	public static void main (String[] args) {
//		String color = "amarillo";
//		
//		switch (color) {
//			case "rojo":
//				System.out.println("Seguir");
//				break;
//			case "amarillo":
//				System.out.println("Cambio de luz");
//				break;
//			default:
//				System.out.println("Parar");
//		}
//	}
//}

// Switch moderno (Solo para java 14)
//public class SentenciaSwitch {
//	public static void main (String[] args) {
//		String color = "amarillo";
//		
//		String accion = switch (color) { 
//			case "rojo"-> "Seguir";
//			case "amarillo" -> "Cambio de luz";
//			default -> "Parar";
//		};
//		System.out.println("Puede" + accion);
//	}
//}

// Ejemplo de switch cuando esta dentro de un for
//public class SentenciaSwitch {
//	public static void main (String[] args) {
//		for(int i = 0; i < 6; i++)
//			
//			switch (i) {
//			case 0 : 
//				System.out.println("Zero");
//				break;
//			case 1 : 
//				System.out.println("One");
//				break;
//			case 2 : 
//				System.out.println("Two");
//				break;
//			case 3 : 
//				System.out.println("Three");
//				break;
//			case 4 : 
//				System.out.println("Four");
//				break;
//			default : 
//				System.out.println("i is greater than 4.");
//				
//			}
//	}
//}

//--------------------------PRACTICAS CON SWITCH------------------------------------
// Días de la semana
//public class SentenciaSwitch {
//	public static void main(String[] args) {
//		int dia = 3;
//		
//		switch (dia) {
//		case 1:
//			System.out.println("Lunes");
//			break;
//		case 2:
//			System.out.println("Martes");
//			break;
//		case 3:
//			System.out.println("Miercoles");
//			break;
//		case 4:
//			System.out.println("Jueves");
//			break;
//		case 5:
//			System.out.println("Viernes");
//			break;
//		case 6:
//			System.out.println("Fin de semana");
//			break;
//		case 7:
//			System.out.println("Fin de semana");
//			break;
//		default:
//			System.out.println("Ingrese una opción valida");
//			break;
//		}
//	}
//}

//Cajero automático

//public class SentenciaSwitch {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int opcion;
//		
//		do {
//			System.out.println("Seleccione una opción:");
//			System.out.println("1. Consultar saldo");
//			System.out.println("2. Retirar dinero");
//			System.out.println("3. Depositar dinero");
//			
//			opcion = scanner.nextInt();
//			
//			if (opcion < 1 || opcion > 3) {
//				System.out.println("Opción Invalida. Intente de nuevo.\n");
//			}
//			
//		} while (opcion < 1 || opcion > 3); // Si se rompe el bucle se ejecuta cajero
//		
//		cajero(opcion);
//	}
//	
//	public static void cajero (int opcion) { 
//		switch (opcion) {
//			case 1:
//				System.out.println("Su saldo es: 350");
//				break;
//			case 2:
//				System.out.println("Retiró: 200");
//				break;
//			case 3:
//				System.out.println("Depósito de: 1000");
//				break;
//		}
//		
//	}
//
//}	

// Menú comida rápida
public class SentenciaSwitch {

    static Scanner scanner = new Scanner(System.in); // Scanner accesible por todos los métodos

    public static void main(String[] args) {
        opciones(); // Se llama desde main
    }

    public static void consultarPrecio() {
        System.out.println();
        System.out.println("Escriba el producto para saber su precio: ");
        String pedido = scanner.next().toLowerCase();

        switch (pedido) {
            case "hamburguesa":
                System.out.println("Precio: $5.00");
                break;
            case "pizza":
                System.out.println("Precio: $7.00");
                break;
            case "ensalada":
                System.out.println("Precio: $4.00");
                break;
            default:
                System.out.println("Producto no disponible");
        }
    }

    public static void opciones() {
        while (true) {
            System.out.println();
            System.out.println("OPCIONES: ");
            System.out.println("-------------------------------");
            System.out.println("1. Para consultar un producto");
            System.out.println("0. Para salir del menú");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                if (opcion == 0) {
                    System.out.println("Bye Bye!");
                    scanner.close();
                    break;
                } else if (opcion == 1) {
                    consultarPrecio();
                } else {
                    System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("¡Error! Ingresa un número válido.");
                scanner.nextLine(); // Limpiar entrada incorrecta
            }
        }
    }
}
