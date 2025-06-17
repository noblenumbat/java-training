package practices;

//public class For{
//	public static void main(String[] args) {
//		for(int tick = 10; tick > 0; tick--) {
//			System.out.println("Tick: " + tick);
//		}
//	}
//}

// Declarando el contandor afuera del bucle for
// Una variable solo accesible desde afuera  cuando se declara afuera del bloque for
public class For{
public static void main(String[] args) {
	int tick;
	for(tick = 10; tick > 0; tick--) 
		System.out.println("Tick: " + tick);
	
	System.out.println("Tick final: " + tick);
}
}