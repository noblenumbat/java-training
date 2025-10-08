package poo.clases_internas;

// Crear clase externa
public class OuterClass2 {
	private int outerVariable = 1000;
	private static int staticOuterVariable = 2000;
	// Crear el método main
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2(); 
		System.out.println(outer.run());
	}
	// Object clase cósmica que contiene la clase local interna  
	Object run() {
		int localVariable = 666;
		final int finalLocalVariable = 300;
		// Crear una clase interna local
		class LocalClass {
			int innerVariable = 40;
			
			int getSum(int parameter) {
				return outerVariable + staticOuterVariable + localVariable + finalLocalVariable + innerVariable + parameter; 
			}
		}
		// Se crea un objeto de la clase local
		LocalClass local = new LocalClass();
		// Que invoca el método
		// y retorna lo que hay dentro de la clase local
		System.out.println(local.getSum(5));
		return local;
	}
}




