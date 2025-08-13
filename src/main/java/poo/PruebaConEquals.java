package poo;

// Escenario con equals redefinido en Employee

public class PruebaConEquals {
	public static void main(String[] args) {
		Employee e1 = new Employee("Juan",1000.0, 2020, 1, 1);
		Employee e2 = new Employee("Juan",1000.0, 2020, 1, 1);
		
		System.out.println(e1.equals(e2)); // true, mismos datos
		
		java.util.HashSet<Employee> set = new java.util.HashSet<>();
		set.add(e1);
		set.add(e2); // no se añade porque detecta que son iguales
		System.out.println(set.size()); // Debería arrojar 1, pero sigue arrojando 2 porque en la clase Employee 
		                                // no redefini hashCode.
										// Ya redefinido da 1 porque genera valores iguales para e1 y e2
										// porque están en la misma dirección de memoria.
	}
}