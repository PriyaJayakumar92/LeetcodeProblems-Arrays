package com.workingproblems;

import java.util.Arrays;

public class FindMaxNum {

	public int findMax(int[] arr) {
		
		int max_num = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max_num) {
				max_num=arr[i];
			}
		}
		return max_num;
	}
	
public int findMax2(int[] arr) {
		
		Arrays.sort(arr);
		int max_num = arr[arr.length-1];
		
		return max_num;
	}
	
	public static void main(String[] args) {
		FindMaxNum max = new FindMaxNum();
		int[] arr= {3,5,20,12,4};
		System.out.println("Maximun number from the given array is: "+max.findMax2(arr));
	}
}
