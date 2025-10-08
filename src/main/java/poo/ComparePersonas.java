package poo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparePersonas {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Ana", 25));
		personas.add(new Persona("Luis", 30));
		personas.add(new Persona("Carlos", 20));
		personas.add(new Persona("Carlos", 20));
		
		// Ordenar la lista  usando Comparable
		Collections.sort(personas);
		
		// Imprimir la lista ordenada
		for (Persona persona :  personas) {
			System.out.println(persona);
		}
	}
}