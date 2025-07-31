package practices;

// throws InterruptedException puede lanzar una excepción si el hilo es interrumpido
// Runnable tarea es una tarea anónima
// .join() esperar ejecución de hilos antes de imprimir

public class StringBufferHilos {
	public static void main (String[] args) throws InterruptedException {
		
		StringBuffer sb = new StringBuffer();
		
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
		System.out.println("Longitud final con StringBuffer: " + sb.length());
	}
}