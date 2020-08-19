package com.workingproblems;

public class SortedSearchArray {

	public static int sortedSearch(int[] a, int begin, int end, int n) {
		if (begin <= end) {
			int mid = (begin + end) / 2;
			if (a[mid] == n) {
				return mid;
			} else if (a[mid] > n) {
				return sortedSearch(a, 0, mid - 1, n);
			} else if (a[mid] < n) {
				return sortedSearch(a, mid + 1, a.length - 1, n);
			} else {
				return -1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] a = { 3, 3, 9, 10 };
		int n = 3;
		System.out.println("Index: " + SortedSearchArray.sortedSearch(a, 0, a.length - 1, n));
	}
}
