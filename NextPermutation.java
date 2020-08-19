import java.util.Arrays;

public class NextPermutation {
	

	 public void nextPermutation(int[] nums) {
		 int flag=0;
		 if(nums.length>=2)
		 {
	       for(int i=nums.length-1;i>0;i--)
	       {
	    	   if(nums[i]>nums[i-1])
	    	   {
	    		   
	    		   for(int j=i;j<nums.length;j++)
	    		   {
	    			   
	    			   if(nums[i-1]>nums[j] || j==nums.length-1)
	    			   {
	    				   int x=0;
	    				   if(j!=nums.length-1)
	    				   {
	    				   x = nums[i-1];
	    	    		   nums[i-1] = nums[j-1];
	    	    		   nums[j-1] = x; 
	    				   }
	    				   else
	    				   {
	    					   x = nums[i-1];
		    	    		   nums[i-1] = nums[j];
		    	    		   nums[j] = x;   
	    				   }
	    				   
	    				 
	    	    		   for(int k=nums.length-1;i<k;i++,k--)
	    	    		   {
	    	    			   
	    	    			  x = nums[i];
	    	    			  nums[i] = nums[k];
	    	    			  nums[k] = x;
	    	    			  
	    	    		   }
	    	    		  System.out.println(Arrays.toString(nums));
	    	    		   flag=1;
	    	    		   break;
	    			   }
	    		   
	    		   }
	    	   }
	    	   if(flag==1)
	    		   break;
	    	   
	       }
			 
	        if(flag==0)
	        {
	        	int k=0;
	        	for(int i=0;i<nums.length;i++)
	        	{
	        		int min = nums[i];
	        		for(int j=i+1;j<nums.length;j++)
	        		{
	        			if(min>nums[j])
	        			{
	        				min = nums[j];
	        				k = j;
	        			}
	        		}
	        		if(min!=nums[i])
	        		{
	        		int y = nums[i];
	        		nums[i] = nums[k];
	        		nums[k] = y;
	        		}
	        	}
	        	System.out.println(Arrays.toString(nums));
	        }
	    }
	 
	 else if(nums.length == 1)
		 System.out.println(Arrays.toString(nums));
	 else
		 System.out.println("No permutation: "+Arrays.toString(nums));
	 }
	 
	public static void main(String[] args) {
		int[] a = {1,3,2};
		NextPermutation n = new NextPermutation();
		n.nextPermutation(a);
	}

}
