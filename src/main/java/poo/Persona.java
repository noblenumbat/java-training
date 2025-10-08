package poo;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int edad;
	// Constructor
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	//Getter
	public String getNombre(){
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	// Implementación del método comparTo
	@Override
	public int compareTo(Persona otraPersona) {
		// Comparar edad
		// return Integer.compare(this.edad, otraPersona.edad);
		// Comparar por nombre
		return this.nombre.compareTo(otraPersona.nombre);
	}
	@Override
	public String toString() {
		return "Persona {nombre: " + nombre + " edad: " + edad + "}";
	}
}