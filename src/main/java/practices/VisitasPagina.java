package practices;

public class VisitasPagina {
	public static void main(String[] args) {
		Counter visitas = new Counter();
		
		for (int i = 0; i < 10; i++) {
			visitas.incrementCount();
		}
		
		System.out.println("Visitas totales: " + visitas.currentCount());
	}
}