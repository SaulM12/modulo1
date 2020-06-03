package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
public Triangle triangle;
@Before
public void before() {
	triangle= new Triangle();
	double side=7.5;
	triangle.setSide(side);
			
}
	@Test
	public void testcalculatePerimeter() {
		assertEquals(22.5, triangle.calculatePerimeter(),0.10);
	}

}
