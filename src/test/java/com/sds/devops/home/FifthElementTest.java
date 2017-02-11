package com.sds.devops.home;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class FifthElementTest {

	@Test
	public void testBasic()  throws Exception{
		FifthElement fifthElement = new FifthElement();	
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i + 1);
		assertEquals(6,  fifthElement.getFifthOfLast(list, 5));		
	}
	
	@Test
	public void testNegative()  throws Exception {
		FifthElement fifthElement = new FifthElement();	
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i + 1);
		assertEquals(-1,  fifthElement.getFifthOfLast(list, -1));		
	}
	
	
	@Test
	public void testBig()  throws Exception{
		FifthElement fifthElement = new FifthElement();	
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 99999; i++)
			list.add(i + 1);
		assertEquals(99999 -4,  fifthElement.getFifthOfLast(list, 5));		
	}
	
	@Test(timeout=1000)
	public void testPerformance() throws Exception {
		FifthElement fifthElement = new FifthElement();	
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 999999; i++)
			list.add(i + 1);
		assertEquals(999999 -4,  fifthElement.getFifthOfLast(list, 5));		
	}
	
}
