package poo;

import static java.lang.Math.*;

public class Circle extends Shape {
	public Double radio;
	public Circle(final Point2D p, final Double r) {
		super(p); // Atributo heredado posición p almacena las coordendas dentro del circulo
		this.radio = r;
	}
	public Circle(final Integer x, final Integer y, final Double r) {
		super(x, y);
		this.radio = r;
	}
	public Circle(final Double x, final Double y, final Double r) {
		super(x, y);
		this.radio = r;
	}
	@Override
	public Double getArea() {
		return PI * this.radio * this.radio;
	}
}