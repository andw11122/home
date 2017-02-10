package com.sds.devops.home;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class IdenticalElementsInTwoLists {
	public static void main(String[] args) throws Exception {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter elements in first list like 1 2 3 ");
		StringTokenizer st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			list1.add(Integer.parseInt(st.nextToken()));
		}

		System.out.print("Enter elements in second list like 1 2 3 ");
		st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			list2.add(Integer.parseInt(st.nextToken()));
		}

		System.out.println("Are elements of two lists identical  ? : " + checkIdenticalLists(list1, list2));

	}

	static boolean checkIdenticalLists(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {

		if (firstList.size() != secondList.size())
			return false;		
		
		boolean ret = true;
		for (int i = 0; i < firstList.size(); i++){			
			if (firstList.get(i) !=secondList.get(i)) ret = false;			
		}		
		return ret;
	}
}
