import java.util.Arrays;

public class MedianSoortedArray {

	
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] c = new int[nums1.length+nums2.length];
	        int i=0;
	        for(int x : nums1)
	        	c[i++] = x;
	        for(int x : nums2)
	        	c[i++] = x;
	        Arrays.sort(c);
	        System.out.println(Arrays.toString(c));
	        //System.out.println(c.length);
	        if(c.length%2==0)
	        {
	        	System.out.println("enter even");
	        	int q = c.length/2;
	        	double d = (Double.valueOf(c[q])+Double.valueOf(c[--q]))/2;
	        	return d;
	        }
	        else
	        {
	        	System.out.println("enter odd");
	        	int q = (c.length+1)/2;
	        	double d = c[--q];
	        	return d;
	        }
	    }

	public static void main(String[] args) {
int[] a = {2,5,7,9};		
int[] b = {1,3,6,8};
MedianSoortedArray  m = new MedianSoortedArray();

System.out.println("Median = "+m.findMedianSortedArrays(a,b));
	}

}
