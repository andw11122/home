package com.sds.devops.home;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class IdenticalElementsInTwoListsTest {

	@Test
	public void testOne() {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		firstList.add(1);secondList.add(1);
		IdenticalElementsInTwoLists identicalElementsInTwoLists = new IdenticalElementsInTwoLists();
		assertTrue(identicalElementsInTwoLists.checkIdenticalLists(firstList, secondList));
	}
	
	@Test
	public void testMultiple() {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		for (int i=1;i<100;i++) {
			firstList.add(i);
			secondList.add(i);
		}
		
		IdenticalElementsInTwoLists identicalElementsInTwoLists = new IdenticalElementsInTwoLists();
		assertTrue(identicalElementsInTwoLists.checkIdenticalLists(firstList, secondList));
	}
	
	@Test
	public void testDifference() {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		firstList.add(1);
		secondList.add(1);
		secondList.add(2);
				
		IdenticalElementsInTwoLists identicalElementsInTwoLists = new IdenticalElementsInTwoLists();
		assertFalse(identicalElementsInTwoLists.checkIdenticalLists(firstList, secondList));
	}

}
