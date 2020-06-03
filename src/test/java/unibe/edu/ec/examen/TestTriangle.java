package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
	public Triangle triangle;

	@Before
	public void before() {
		triangle = new Triangle();
		double side = 8.0;
		triangle.setSide(side);

	}

	@Test
	public void testcalculatePerimeter() {
		assertEquals(24, triangle.calculatePerimeter(), 0.10);
	}

	@Test
	public void testecalculateArea() {
		assertEquals(35.76, triangle.calculateArea(8.94), 0.1);
	}

	@Test
	public void testcalculateVolumen() {
		assertEquals(130.66, triangle.calculateVolume(7.0, 8.0), 0.10);
	}
}
