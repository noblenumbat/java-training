package poo.exceptions;


class MiRecurso implements AutoCloseable {
	private String nombre;
	
	public MiRecurso (String nombre) {
		this.nombre = nombre;
		System.out.println("Recurso " + nombre + " abierto");
	}
	
	public void usar() {
		System.out.println("Usando el recurso " + nombre + "...");
		//Simulamos el error
		if ("R2".equals(nombre)) {
			throw new RuntimeException("Error al usar el recurso " + nombre);
		}
	}
	
	@Override
	public void close() {
		System.out.println("Cerrando el recurso " + nombre + "...");
		// Simulamos otro posible error al cerrar
		if ("R1".equals(nombre)) {
			throw new RuntimeException("Error al cerrar el recurso " + nombre);
		}
	}
}

public class EjemploTryWithResources {
	public static void main (String[] args) {
		try (MiRecurso r1 = new MiRecurso ("R1");
			 MiRecurso r2 = new MiRecurso ("R2")) {
			
			r1.usar();
			r2.usar();
		} catch (Exception e) {
			System.out.println("Se capturó una excepción " + e.getMessage());
			// Mostrar también las suprimidas
			for (Throwable sup : e.getSuppressed()) {
				System.out.println("Excepción suprimida: " + sup.getMessage());
			}
		}
	}
}