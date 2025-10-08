package poo.clases_internas;

public class OuterClass4 {
	int OuterVariable = 100;
	private static int staticOuterVariable = 200;  
	public static class StaticMemberClass {
		int innerVariable = 20;
		int getSum(int parameter) {
			// No se puede sumar OuterVariable porque no es una variable estatica 
			return innerVariable + staticOuterVariable + parameter;
		}
	}
	public static void main(String[] args) {
		OuterClass4 outer = new OuterClass4();
		StaticMemberClass inner = new StaticMemberClass();
		System.out.println(inner.getSum(15));
		outer.run(); // outer que es una instancia de la clase externa solo puede acceder al método de la clase interna
	}
	void run() { // a través de un metodo que envuelva a una instancia de la clase interna
		StaticMemberClass localinner = new StaticMemberClass();
		System.out.println(localinner.getSum(20));
	}
}