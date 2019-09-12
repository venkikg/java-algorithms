package com.venky.java.array;

import java.util.Arrays;
import java.util.List;

/*
Steps: 
1) Use two index variables i and j, initial values i = 0, j = 0
2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
4) If both are same then print any of them and increment both i and j.
5) Print remaining elements of the larger array.
*/

public class FindIntersectionAndUninonArrays {
	
	
	private static void printIntersection(List<Integer> items1, List<Integer> items2) {
		
		int m = 0;
		int n = 0;		
		
		while (m < items1.size() && n < items2.size()) {
			if(items1.get(m) < items2.get(n)) {
				m++;
			} else if(items1.get(m) > items2.get(n)) {
				n++;
			} else if(items1.get(m) == items2.get(n)) {
				System.out.print(items1.get(m)+" ");
				m++;
				n++;
			}
		}

	}
	
	private static void printUnion(List<Integer> items1, List<Integer> items2) {
		
		int m = 0;
		int n = 0;		
		
		while (m < items1.size() && n < items2.size()) {
			if(items1.get(m) < items2.get(n)) {
				System.out.print(items1.get(m)+" ");
				m++;
			} else if(items1.get(m) > items2.get(n)) {
				System.out.print(items2.get(n)+" ");
				n++;
			} else if(items1.get(m) == items2.get(n)) {
				System.out.print(items1.get(m)+" ");
				m++;
				n++;
			}
		}
		
		while (m < items1.size()) {
			System.out.print(items1.get(m)+" ");
			m++;
		}
		
		while (n < items2.size()) {
			System.out.print(items2.get(n)+" ");
			n++;
		}
	}
	
	
	public static void main(String[] args) {
		List arr1 = Arrays.asList(1, 2, 4, 5, 6); 
        List arr2 = Arrays.asList(2, 3, 5, 7); 
        System.out.print("Intersection: ");
        printIntersection(arr1, arr2); 
        System.out.println("");
        System.out.print("Union: ");
        printUnion(arr1, arr2);
	}

}
