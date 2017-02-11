package com.sds.devops.home;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class FifthElement {

	public static final int POSITION = 5;


	public static void main(String[] args) throws Exception {

		System.out.println("Enter the number of elements over 5");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int elements = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < elements; i++)
			list.add(i + 1);

		System.out.println(getFifthOfLast(list, POSITION));		
	}

	public static int getFifthOfLast(LinkedList<Integer> list, int position)  throws Exception {
		
		if (position < 5) return -1;
		
		for (int i = 0; i < position-1; i++) 
			list.removeLast();	
		
		return (int)list.getLast();		
	}	
}
