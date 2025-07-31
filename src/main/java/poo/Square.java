package poo;

public class Square extends Shape {
	public Double side;
	public Square (final Point2D p, final Double side) {
		super(p);
		this.side = side;
	}
	// Que necesidad hay de sobrecargar los constructores
	// Primero como Integer
	public Square (final Integer x, final Integer y, Double side) {
		super(x,y);
		this.side = side;
	}
	// Despues como Double
	public Square (final Double x, final Double y, Double side) {
		super(x,y);
		this.side = side;
	}
	@Override
	public Double getArea() {
		return this.side * this.side;
	}
}