package practices;

public class StringBufferPrac {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hola");
		
		sb.append(" mundo");		// Hola mundo
		sb.insert(5, "Java "); 		// Hola Java mundo
		sb.replace(0, 4, "Hey");	// Hey Java mundo
		sb.delete(4, 9);			// Hey mundo
		sb.reverse();				// odnum yeH		
		
		System.out.println(sb); 	// Hola mundo 
	}
}