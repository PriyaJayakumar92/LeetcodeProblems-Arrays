package com.workingproblems;

import java.util.Arrays;

public class ArrayRotation {
	public static void rotate(int[] a, int r) {
		while (r > 0) {
			int temp = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
			r--;
			System.out.println(Arrays.toString(a));
			// Arrays.stream(a).forEach(e -> System.out.print(e));
			// System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 5,6,7,8,9};
		int r = 2;
		rotate(arr, r);
	}
}
