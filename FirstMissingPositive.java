import java.util.Arrays;

public class FirstMissingPositive {
	
	    public int firstMissingPositive(int[] nums) {
	        Arrays.sort(nums);
	        System.out.println(Arrays.toString(nums));
	        int j=1;
	        for(int i=0;i<nums.length;i++)
	        {
	        	while(nums[i]>=j)
	        	{
	        		if(nums[i]!=j)
	        		{
	        			return j;
	        		}
	        		else
	        		{
	        			j++;
	        			break;
	        		}
	        	}
	        }
	        return j;
	    }
	    
	    
	    public static void main(String[] args)
	    {
	    	FirstMissingPositive s = new FirstMissingPositive();
	        int[] a = {3,4,-1,1,2};
	        System.out.println("The first missing positive number is: "+s.firstMissingPositive(a));
	    }
	}

	

