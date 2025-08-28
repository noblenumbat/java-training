package poo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestClone {
	public static void main (String[] args) throws CloneNotSupportedException {
		CloneableEmployee e1 = new CloneableEmployee("Ana", 2000.0, 2020, 1, 1);
		CloneableEmployee e2 = e1.clone(); // se crea una copia
		
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
		
		// Para asignar la fecha manualmente
		GregorianCalendar cal = new GregorianCalendar(2013, Calendar.NOVEMBER, 14);
		Date nuevaFecha = cal.getTime();
		
		// Cambiar fecha contrato en el clon NO afecta al original
		// e2.setFechaContrato(new Date()); // Fecha y hora real del sistema
		e2.setFechaContrato(nuevaFecha);
		System.out.println("Después de modificar fecha del clon:");
		System.out.println("Original: " + e1);
		System.out.println("Clon:     " + e2);
	}
}