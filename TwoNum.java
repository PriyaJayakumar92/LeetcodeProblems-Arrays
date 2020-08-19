//import java.util.Arrays;
import java.util.*;
//import java.lng.Object;



public class TwoNum {

	public static int[] twoSum(int[] nums, int target)
	{
	Set<Integer> s = new HashSet<>();
	for(int i:nums)
		s.add(i);
	//System.out.println(s);
	int[] a = new int[s.size()];
	int i=0;
	for(int x:s)
		a[i++]=x;
	for(int j=0;j<a.length;j++)
	{
		for(int k=j+1;k<a.length;k++)
		{
			
		}
	}
	return a;
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
int[] a= {2,5,2,6,1};
int target = 7;
for(int i=0;i<a.length)
int[] b=twoSum(a,target);
System.out.println(Arrays.toString(b));
	}

}
