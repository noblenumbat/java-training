package poo;

// == compara referencia al mismo objeto, siempre da true si se trata del mismo objeto, a excepción del String Pool 
// donde si se cambia el contenido se crea un objeto distinto.

// equals compara contenido, carácter por carácter. Sin son objetos distintos pero el contenido es el mismo, es true.

public class SuperClaseCosmica{
	String a = "Hello";
	String b = "Hell";
	String s1 = "Hola";
	String s3 = new String("Hola");
	
	public static void main (String[] args) {
		SuperClaseCosmica obj = new SuperClaseCosmica();
		System.out.println(obj.ComprobarReferencia() + " del ==");
		SuperClaseCosmica OtherObj = new SuperClaseCosmica();
		System.out.println(OtherObj.ComprobarContenido() + " de equals");
	}
	
	// ==
	public boolean ComprobarReferencia() {
		if (a == b) {
			return true;
		}
		return false; // Retorna false
	}
	
	// Equals
	public boolean ComprobarContenido() {
		if(s1.equals(s3)) {
			return true; // Retorna true
		}
		return false;
	}
}


