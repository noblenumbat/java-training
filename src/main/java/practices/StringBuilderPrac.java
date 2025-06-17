package practices;

public class StringBuilderPrac {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Bienvenido");
		
		sb.append(" a java");		// Bienvenido a java
		sb.insert(11, " Mundo "); 	// Bienvenido  Mundo a java
		sb.delete(0, 3);			// nvenido  Mundo a java
		sb.reverse();				// avaj a odnuM  odinevn		
		
		StringBuilder  derecha = sb;
		derecha.reverse(); // nvenido  Mundo a java
					
	}
}