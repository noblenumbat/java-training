package poo.equals_practices;

import java.util.Objects;

public class Manager extends Employee {
	private double incentivo;
	
	public Manager(String nombre, double sueldo, double incentivo) {
		super(nombre, sueldo);
		this.incentivo = incentivo;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false; // compara atributos de Employee
		Manager other = (Manager) otherObject; // ya es seguro castear
		return Double.compare(incentivo,  other.incentivo) == 0; // Devuelve true si incentivo y other.incentivo son iguales, y false en caso contrario
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), incentivo);
	}
}

//  NOTAS
//🔍 Lo que demuestra
//
//Con super.equals(...):
//
//Primero compara los atributos heredados (nombre, sueldo).
//
//Luego compara el campo nuevo (incentivo).
//
//Evita que dos Manager con diferente salario o nombre pasen por error como “iguales”.
//
//Mantiene la coherencia con la jerarquía de clases.
//
//Si quitáramos super.equals(...):
//
//Solo se compararía incentivo.
//
//Un Manager("Ana", 5000, 500) y un Manager("Ana", 3000, 500) serían erróneamente iguales porque se ignorarían los datos de Employee.