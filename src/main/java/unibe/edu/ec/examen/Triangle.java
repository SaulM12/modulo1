package unibe.edu.ec.examen;

public class Triangle {
	public double side;

	public Triangle(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

public double calculatePerimeter() {
	return this.side*3;
}
}
