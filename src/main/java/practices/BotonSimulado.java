package practices;

public class BotonSimulado{
	public static void main (String[] args) {
		Counter clics = new Counter(); // Marca error porque a la clase se le puso un limite de incremento y necesita un parámetro.
		
		clics.incrementCount();
		clics.incrementCount();
		
		System.out.println("Clics realizados: " + clics.currentCount()); // 2
		
		clics.reset();
		System.out.println("Después del reset: " + clics.currentCount() ); // 0
		
	}
}