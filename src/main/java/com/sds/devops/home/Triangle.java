package com.sds.devops.home;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
	public static enum Type {
		EQUILATERAL, ISOSCELES, SCALENE, FAIL
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Enter three sides of Triangle like 2 3 4");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int sideFirst = Integer.parseInt(st.nextToken());
		int sideSecond = Integer.parseInt(st.nextToken());
		int sideThird = Integer.parseInt(st.nextToken());

		System.out.println(checkTypeTriangle(sideFirst, sideSecond, sideThird));
		

	}

	public static Triangle.Type checkTypeTriangle(int first, int second, int third) {
		
		if (first < 0 || second < 0 ||third < 0) 
			return Triangle.Type.FAIL ;
		
		if (first == second && second == third && third == first)
			return Triangle.Type.EQUILATERAL;
		else if ((first == second) || (second == third) || (third == first))
			return Triangle.Type.ISOSCELES;
		else
			return Triangle.Type.SCALENE;

	}
}
