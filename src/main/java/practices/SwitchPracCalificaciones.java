package practices;

public class SwitchPracCalificaciones {
	public static void main (String[] args) {
		char nota = 'B';
		
		switch (nota) {
			case 'A' : System.out.println("Excelente");
			break;
			case 'B' : System.out.println("Bueno");
			break;
			case 'C' : System.out.println("Regular");
			break;
			case 'D' : System.out.println("Insuficiente");
			break;
			case 'F' : System.out.println("Reprobado");
			break;
			default : System.out.println("Nota no valida");
		}
	}
}