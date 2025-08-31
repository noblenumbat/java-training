package poo;

public class TestCloneCloneableManager {
	public static void main (String[] args) throws CloneNotSupportedException {
		CloneableManager e1 = new CloneableManager("Ana", 2000.0, 2020, 1, 1);
		
		CloneableManager e2 = e1.clone(); // se crea una copia
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
		System.out.println("Despues de aplicar el incentivo en el clon");
		e2.setIncentivo(500.0);
		System.out.println("Sueldo del original: " + e1.getSueldo());
		System.out.println("Sueldo del clon: " + e2.getSueldo());
	}
}
