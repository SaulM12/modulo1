package unibe.edu.ec.examen;

public class Triangle {
	public double side;

	public Triangle(double side) {
		this.side = side;
	}

	public Triangle() {

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double calculatePerimeter() {
		return this.side * 3;
	}

	public double calculateArea(double height) {
		return (this.side * height) / 2;
	}

	public double calculateVolume(double baseSide, double heightPiramid) {
		return (baseSide * baseSide * heightPiramid) / 3;
	}
}
