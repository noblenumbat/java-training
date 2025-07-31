package poo;

public class  AreaSquare {
	public static void main (String args[]) {
//		Point2D p = new Point2D(3.0,4.0);
//		Square s = new Square(p,5.0);
		
		Square s = new Square(2.0,3.0,4.0);
		
		System.out.println("El área del cuadro es: " + s.getArea());
		//System.out.println("La coordenada de la esquina superior del cuadrado es: " + "( " + p.getX() + " , " + p.getY() + " )");
	}
}