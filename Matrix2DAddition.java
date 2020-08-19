package com.workingproblems;

import java.util.Arrays;

//import java.util.Arrays;

public class Matrix2DAddition {
	public static int[][] matrixAdd(int[][] arr1,int[][] arr2) {
		int[][] arr3 = new int[2][2];
		for(int row=0;row<arr1.length;row++) {
			for(int col=0;col<arr1[row].length;col++) {
				arr3[row][col] = arr1[row][col] + arr2[row][col];
			}
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{2,3},{5,6}};
		int[][] arr2 = {{4,5},{7,8}};
		int[][] arr3 = matrixAdd(arr1,arr2);
		//System.out.println(Arrays.toString(arr3));
		/*for(int row=0;row<arr1.length;row++) {
			for(int col=0;col<arr1[row].length;col++) {
				System.out.print(arr3[row][col]);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(Arrays.deepToString(arr3));
		
		/*for(int r=0;r<arr1.length;r++) {
			System.out.println(Arrays.toString(arr3[r]));
		}*/
		
		
		
	}
}
