package poo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCopiaConstructor {
	public static void main(String[] args) {
		// Crear un empleado original
		ConstructorCopiaEmployee e1 = new ConstructorCopiaEmployee("Ana", 2000.0, 2020, 1, 1);
		
		// Crear un clon usando el constructor de copia
		ConstructorCopiaEmployee e2 = new ConstructorCopiaEmployee(e1);
		
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
		
		// Si modificamo la fecha del clon, no afecta al original
		e2.setFechaContrato(new GregorianCalendar(2025, Calendar.AUGUST, 15).getTime());
		
		System.out.println("Después de modificar fecha del clon:");
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
		
	}
}