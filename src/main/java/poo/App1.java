package poo;

// Reglas para resolver colisiones de métodos por defecto
// Regla 1. Pág. 99
// El método declarado en la clase tiene prioridad sobre el método declarado en la interfaz que implementa.

public class App1 implements A {
	@Override
	public void doSth() {
		System.out.println("inside App1");
	}
	public static void main(String[] args) {
		new App1().doSth();
	}
}