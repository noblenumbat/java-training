package poo;

// Ejemplo sin redefinir el método equals en la clase Employee

public class PruebaSinEquals {
	public static void main(String[] args) {
		Employee e1 = new Employee("Juan",1000.0, 2020, 1, 1);
		Employee e2 = new Employee("Juan",1000.0, 2020, 1, 1);
		
		System.out.println(e1.equals(e2)); // false, aunque tengan los mismos datos
		
		java.util.HashSet<Employee> set = new java.util.HashSet<>();
		set.add(e1);
		set.add(e2); // se añade porque no detecta que son iguales
		System.out.println(set.size()); // 2
	}
}