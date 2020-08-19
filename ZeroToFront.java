package com.workingproblems;

import java.util.Arrays;

class Logic {

	public void pushZeroToFront(int[] a) {
		int j;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				j=i;
				while(j>0) {
				a[j] = a[j-1];
				j--;
				}
				a[j]=0;
			}
		}
		}
}

public class ZeroToFront{
	public static void main(String[] args) {
		Logic l = new Logic();
		int[] a = {1,0};
		l.pushZeroToFront(a);
		Arrays.stream(a).forEach(e -> System.out.println(e));
	}
}
