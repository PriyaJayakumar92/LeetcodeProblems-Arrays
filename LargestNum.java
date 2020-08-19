package com.workingproblems;

public class LargestNum {
	
	    public static long solution(long[] numbers) {
	       long large = numbers[0];
	       if(numbers.length!=0){
	      		for(int i=1;i<numbers.length;i++){
	       				if(numbers[i]>large){
	                large=numbers[i];
	    					}
	       		}
	         	return large;
	       }
	      return 0;
	}
	    
	public static void main(String[] args) {
		long[] numbers = {1,2,4};
		System.out.println(LargestNum.solution(numbers));
	}


}
