import java.util.Arrays;

public class MergeSortedArray {
	
	public int[] merge(int a[], int b[]){
		int[] c = new int[a.length+b.length];
		int i=0,j=0, k=0;
		for(;i<a.length;i++) {
			for(;j<b.length;j++) {
			  if(a[i]>b[j])
			  {
				  c[k] = a[i];
				  k++;
				  break;
			  }
			  else
			  {
				  c[k] = b[j];
				  k++;
				  
			  }
			}
			}
		if(i==a.length)
		{
			for(;j<b.length;j++)
			{
				c[k] = b[j];
				k++;
			}
		}
		else if(j==b.length)
		{
			for(;i<a.length;i++)
			{
				c[k] = a[i];
				k++;
			}
		}
				
				
	    return c;
	}

	public static void main(String[] args) {
		MergeSortedArray m = new MergeSortedArray();
		int[] a = {8, 4, 1};
		int[] b = {6, 3, 0};
		int[] c = m.merge(a,b);
		System.out.println(Arrays.toString(c));

	}
}
