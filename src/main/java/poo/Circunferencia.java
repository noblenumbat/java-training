package poo;

public class Circunferencia {
	public static void main(String[] args) {
		// Crea un círculo con centro (2.0, 3.4) y radio (4.0)
		Circle circulo = new Circle(2.0, 3.0, 4.0);
		
		// Obtener el área desde método abstracto getArea()
		double area = circulo.getArea();
		
		// Calcular el radio a partir del área
		double radioCalculado = Math.sqrt(area / Math.PI);
		
		// Calcular la longitud
		double longitud = 2 * Math.PI * radioCalculado;
		
		System.out.println("Área (usando getArea()): " + area);
		System.out.println("Radio calculado desde el área): " + radioCalculado);
		System.out.println("Longitud de la circunferencia: " + longitud); 
	}
}