package com.workingproblems;

public class SumOfDigit {
	static int var = 10;
	static {
		System.out.println("Hello Riya"+" "+var);
	}
	
	public static void sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
		sum += num%10;
		num /= 10;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		SumOfDigit.sumOfDigit(1025);

	}

}
