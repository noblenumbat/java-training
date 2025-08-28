package poo.equals_practices;

import java.util.Objects;

public class Employee {
	private String nombre;
	private double sueldo;
	
	public Employee(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) return true; // compara sin son el mismo objeto en memoria
		if (otherObject == null || getClass() != otherObject.getClass()) return false; // si hay ausencia de Object o no se trata del mismo objeto
		
		Employee other = (Employee) otherObject;
		return Double.compare(sueldo, other.sueldo) == 0 &&
				Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, sueldo);
	}
}