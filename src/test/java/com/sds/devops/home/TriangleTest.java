package com.sds.devops.home;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
		
	@Test
	public void test() {
		Triangle triangle = new Triangle();		
		assertEquals("ISOSCELES",  triangle.checkTypeTriangle(1, 2, 3).ISOSCELES.name());		
		assertEquals("EQUILATERAL",  triangle.checkTypeTriangle(1, 2, 3).EQUILATERAL.name());
		assertEquals("SCALENE",  triangle.checkTypeTriangle(1, 2, 3).SCALENE.name());
	}
	
	@Test
	public void testNegative() {
		Triangle triangle = new Triangle();		
		assertEquals("FAIL",  triangle.checkTypeTriangle(-1, -2, -3).FAIL.name());		
		
	}
	
}
