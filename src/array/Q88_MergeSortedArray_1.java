package array;
		
import java.util.Arrays;

// Method 1:	
// Time:O((m+n)log(m+n)), Space:O(log(m+n))
public class Q88_MergeSortedArray_1 {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 for ( int i =0; i !=n;i++) {
			 nums1 [m+i]= nums2[i];
		 }
		 Arrays.sort(nums1);
	 }


// Method2: Two Pointers	
// Time:O(m+n), Space:O(m+n)
public void merge2(int[] nums1, int m, int[] nums2, int n) {
	int p1 =0, p2=0;
	int sort[] = new int[m+n];
	int cur;
	while (p1<m || p2<n) {
		if(p1==m) {
			cur = nums2[p2++];
		}
		else if (p2==n) {
			cur = nums1[p1++];
		}
		else if (nums1[p1]>nums2[p2]) {
			cur = nums2[p2++];
		}
		else cur = nums1[p1++];
		sort[p2+p1-1] = cur;
	}
	for (int i=0; i!= m +n; i++){
		nums1[i]= sort[i];}
}



//Method2: Two Pointers	
//Time:O(m+n), Space:O(m+n)
public void merge3(int[] nums1, int m, int[] nums2, int n) {
	int p1 = m-1, p2= n-1, tail = m+n-1;
	int cur;
	while (p1>=0 || p2>=0) {
		if (p1==-1) cur = nums2[p2--];
		else if (p2==-1) cur =nums1[p1--];
		else if (nums1[p1]>nums2[p2])  cur= nums1[p1--];
		else cur =nums2[p2--];
		nums1[tail--]= cur;	}	
	}
}












