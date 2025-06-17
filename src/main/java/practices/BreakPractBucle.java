package practices;

public class BreakPractBucle{
	public static void main(String[] args) {
		int[] numeros = {2,4,6,8,10,12,14};
		int buscar = 10;
		
		for(int num : numeros) {
			if (num == buscar) {
				System.out.println("¡Número encontrado: " + num + "!");
				break; // Sale del bucle cuando lo encuentra
			}
			System.out.println("Revisando: " + num);
		}
		System.out.println("Fin programa.");
	}
}