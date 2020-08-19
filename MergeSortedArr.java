import java.util.Arrays;

public class MergeSortedArr {

public void merge(int[] nums1, int m, int[] nums2, int n) {
	int j=0,p = m-n;
        for(int i=0;i<n;i++) {
        	for(;j<p;j++) {
        		if(nums1[j]>=nums2[i]) {
        			for(int k=p-1;k>=j;k--) {
        				nums1[k+1] = nums1[k];
        			}
        			nums1[j] = nums2[i];
        			j++;
        			p++;
        			break;
        		}
        		else if(j==p-1){
        			while(i<n) {
        			nums1[p] = nums2[i];
        			p++;
        			i++;
        			}
        			break;
        		}
        	}
        }
        System.out.println(Arrays.toString(nums1));
    }

	public static void main(String[] args) {
		
		MergeSortedArr m = new MergeSortedArr();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		m.merge(nums1, nums1.length, nums2, nums2.length);
	}

}
