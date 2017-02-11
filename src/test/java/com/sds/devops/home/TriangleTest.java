package com.sds.devops.home;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TriangleTest {
		
	@Test
	public void testISOSCELES() throws Exception {
		Triangle triangle = new Triangle();		
		assertEquals("ISOSCELES",  triangle.checkTypeTriangle(1, 2, 3).ISOSCELES.name());			
	}
	
	@Test
	public void testEQUILATERAL()  throws Exception {
		Triangle triangle = new Triangle();				
		assertEquals("EQUILATERAL",  triangle.checkTypeTriangle(2, 2, 2).EQUILATERAL.name());
	}
	@Test
	public void testSCALENE()  throws Exception {
		Triangle triangle = new Triangle();				
		assertEquals("SCALENE",  triangle.checkTypeTriangle(1, 1, 3).SCALENE.name());
	}
	
	@Test(timeout=10)
	public void testPerformance()  throws Exception {
		Triangle triangle = new Triangle();				
		assertEquals("SCALENE",  triangle.checkTypeTriangle(1, 1, 3).SCALENE.name());
		assertEquals("EQUILATERAL",  triangle.checkTypeTriangle(2, 2, 2).EQUILATERAL.name());
		assertEquals("SCALENE",  triangle.checkTypeTriangle(1, 1, 3).SCALENE.name());
		assertEquals("SCALENE",  triangle.checkTypeTriangle(1, 1, 3).SCALENE.name());
		assertEquals("EQUILATERAL",  triangle.checkTypeTriangle(2, 2, 2).EQUILATERAL.name());
		assertEquals("SCALENE",  triangle.checkTypeTriangle(1, 1, 3).SCALENE.name());
	}
	
	@Test
	public void testNegative()  throws Exception {
		Triangle triangle = new Triangle();		
		assertEquals("FAIL",  triangle.checkTypeTriangle(-1, -2, -3).FAIL.name());		
		
	}
	
	@Test
	public void testBoundary() throws Exception  {
		Triangle triangle = new Triangle();		
		assertEquals("EQUILATERAL",  triangle.checkTypeTriangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE).EQUILATERAL.name());		
		
	}
	

		
	
}
