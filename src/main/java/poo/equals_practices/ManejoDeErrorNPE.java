package poo.equals_practices;

public class ManejoDeErrorNPE {
	public static void main(String[] args) {
		
		String texto = null;
		// acceder a un método de un objeto que es null
		// System.out.println(texto.length()); // NullPointerException
		
		Employee emp = null;
		// acceder a un atributo de un objeto que es null
		//System.out.println(emp.getNombre()); // NPE
		
		String s = null;
		// usar equals de forma insegura
		// System.out.println(s.equals("hola")); // NPEs

		// ahora equals tiene sentido
		// por eso, en el equals redefinido se usa Objects.equals(a, b) o se pone la constante primero:
		
		System.out.println("hola".equals(s)); // false
		
//		Por qué pasa
//
//		En Java, las variables que apuntan a objetos son referencias.
//		Si una referencia es null, significa que no apunta a ningún objeto en memoria.
//		Cuando intentas usarla como si apuntara a uno, Java lanza NullPointerException.
		
	}
}