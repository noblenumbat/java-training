package practices;

public class StringBuilderHilos {
	public static void main (String[] args) throws InterruptedException {
		
		StringBuilder sb = new StringBuilder();
		
		Runnable tarea = () -> {
			for (int i = 0; i < 1000; i++) {
				sb.append("A");
			}
		};
		
		Thread hilo1 = new Thread(tarea);
		Thread hilo2 = new Thread(tarea);
		
		hilo1.start();
		hilo2.start();
		
		hilo1.join();
		hilo2.join();
		
		System.out.println("Longitud final con StringBuilder: " + sb.length());
	}
}