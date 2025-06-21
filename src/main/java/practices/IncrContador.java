package practices;

public class IncrContador {
	public static void main(String[] args) {
		CounterParIncr contador = new CounterParIncr();
		
		// Incrementar en 5
		contador.incrementCount(5);
		System.out.println("Valor depues de incrementar 5: " + contador.currentCount());
		
		// Incrementar en 10
		contador.incrementCount(10);
		System.out.println("Valor depues de incrementar 10: " + contador.currentCount());
		
		// Intentar con un valor negativo (debería mostrar un mensaje de advertencia)
		contador.incrementCount(-3);
		
		// Resetear el contador
		contador.reset();
		System.out.println("Valor despues de resetear: " + contador.currentCount());
	}
}