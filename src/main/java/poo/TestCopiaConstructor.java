package poo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCopiaConstructor {
	public static void main(String[] args) {
		// Crear un empleado original
		ConstructorCopiaManager e1 = new ConstructorCopiaManager("Ana", 2000.0, 2020, 1, 1);
		
		// Crear un clon usando el constructor de copia
		ConstructorCopiaManager e2 = new ConstructorCopiaManager(e1);
		
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
		System.out.println("");
		// Si modificamo la fecha del clon, no afecta al original
		e2.setFechaContrato(new GregorianCalendar(2025, Calendar.AUGUST, 15).getTime());
				
		System.out.println("Después de modificar fecha del clon:");
		System.out.println("");
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
		System.out.println("");
		
		System.out.println("Despues de sumar el incentivo:");
		System.out.println("");
		e1.setIncentivo(500.0);
		e2.setIncentivo(1300.0);
		System.out.println("Incentivo del original: " + e1.getSueldo());
		System.out.println("Incentivo del clon:     " + e2.getSueldo());
		
				
	}
}