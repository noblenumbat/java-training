package poo.clases_internas;

// Crear clase externa
// Esta clase publica se llama ClaseAnonima, pero en realidad es la clase externa. El nombre es solo para ubicar el ejercicio.
public class ClaseAnonima {
	private int outerVariable = 1000;
	private static int staticOuterVariable = 2000;
	// Crear el método main
	public static void main(String[] args) {
//		- Crear una instancia de OuterClass2.
		ClaseAnonima outer = new ClaseAnonima();
//		- Llamar al método getSum con un valor.
		System.out.println(outer.getSum(34));
//		- Imprimir el resultado.
		
		
	}
	public int getSum(int parameter) {
		int localVariable = 666;
		final int finalLocalVariable = 300;
		// Crear una clase anonima que implementa la interfaz
		SumInterface sumObject = new SumInterface() {
			int innerVariable = 4;
			
			@Override
			public int getSum(int param) {
				return outerVariable + staticOuterVariable + localVariable + finalLocalVariable + innerVariable + parameter; 
			}
		};
		
		return sumObject.getSum(parameter);
	}
}




