package com.venky.java.array;

import java.util.Arrays;
import java.util.List;

public class FindMissingNo {
	
	private static Integer getMissingNo(List<Integer> items) {
		
		int n = items.size();
		
		int sum = (n+1)*(n+2)/2;
		for(int i =0; i< n; i++) {
			sum -= items.get(i);
		}
		return sum;
	}
	
	private static Integer getMissingNoByXOR(List<Integer> items) {
		int n = items.size();
		
		int x1 = items.get(0);
		int x2 = 1;
		
		for (int i = 1; i < items.size(); i++) {
			x1 = x1 ^ items.get(i);
		}
		
		for (int i = 2; i <= items.size() + 1; i++) {
			x2 = x2 ^ i;
		}
		
		return (x1 ^ x2);
	}
	
	
	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1, 2, 4, 5, 6 );
		System.out.println("missing no sum:"+ getMissingNo(items));
		System.out.println("missing no XOPR:"+ getMissingNoByXOR(items));
	}

}
