package practices;

public class DespertadorDoWhile{
	
	public static void main (String[] args) {
		alarma();
	}
		
	public static void alarma () {
		
		int seg = 0;
		int min = 0;
		System.out.println("********* Alarma Activa! *********");
		System.out.println();
		
		do {
			seg++; 
			if (seg == 60 || seg == 120 || seg == 180 || seg == 240 || seg == 299) min++;  
			if (seg == 60 || seg == 120 || seg == 180 || seg == 240 || seg == 299) System.out.println("Min: " + min + " <<beep!>>");
			
		} while (seg <= 299); 
		System.out.println();
		System.out.println("Sigues dormido!");
	} 
} 