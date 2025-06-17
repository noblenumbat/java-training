package practices;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Ordenar empleados por salario

record Empleado(String nombre, double salario) {}// This a object class 

public class sortedPrac{
	public static void main(String args[]){
		List<Empleado> empleados = List.of( // Make a list with the data inserted on the object instance employees
				new Empleado("Ana", 2200),
				new Empleado("Luis", 1800),
				new Empleado("Carlos", 2500)
		);
		
		List<Empleado> ordenados = empleados.stream() // Get the data from employees List
				//.sorted(Comparator.comparing(Empleado::salario))
				.sorted(Comparator.comparing(Empleado::salario).reversed()) // Desc
				.collect(Collectors.toList());

		ordenados.forEach(System.out::println); // It take each element and print it on the console
	}
}