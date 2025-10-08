package poo.clases_internas;

public class OuterClass {
	// Crear una variable privada de la clase externa
	private int OuterVariable = 20;
	
	// Crear una clase interna que sea pública
	private class InnerClass {
		int innerVariable = 20;
		int getSum(int parameter) {
			return innerVariable + OuterVariable + parameter;
		}
	}
	// Crear el método principal
	public static void main (String[] args) {
		// Se crean referencias a OuterClass e InnerClass
		OuterClass outer = new OuterClass();
		outer.run();
	}
	// Crear el metodo run() que se invoca en el main y que pone a correr el método en la clase interna
	void run() {
		InnerClass localVariable = new InnerClass();
		System.out.println(localVariable.getSum(5));
	}
}