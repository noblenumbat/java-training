package practices;

/*
Comparación			¿Qué compara?				Resultado
== 		  			Referencias	(memoria)		true solo si el mismo objeto
.equals()			Contenido (caracteres)		true si el texto es igual
*/    

// Ejemplo con referencias


//public class ReferenciasVSContenido {
//	public static void main (String args []) {
//		String a = "Bye";
//		String b = "Bye";
//		
//		System.out.println(a == b); // true
//	}
//}


// Ejemplo con contenido: para comparar contenido usamos a.equals(b)

public class ReferenciasVSContenido {
	public static void main (String args []) {
		String a = new String("Hola");
		String b = new String("Hola");
		
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
	}
}