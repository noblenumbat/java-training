package poo.equals_practices;

public class TestEquals {
	public static void main (String[] args) {
		Manager m1 = new Manager("Ana", 3000, 500);
		Manager m2 = new Manager("Ana", 3000, 500);
		Manager m3 = new Manager("Ana", 3000, 1000); // mismo salario pero incentivo distinto
		Employee e1 = new Employee("Ana", 3000);
		
		System.out.println(m1.equals(m2));  // true (mismos atributos + incentivo)
		System.out.println(m1.equals(m3));  // false (incentivo distinto)
		System.out.println(m1.equals(e1));  // false (tipos distintos, incentivo no comparable)
		
		System.out.println(m1);
		System.out.println(e1);
	}
}