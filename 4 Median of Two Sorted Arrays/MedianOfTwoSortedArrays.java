/**
*该方法的核心是将原问题转变成一个寻找第k小数的问题（假设两个原序列升序排列），
*这样中位数实际上是第(m+n)/2小的数。所以只要解决了第k小数的问题，原问题也得以解决。
*/
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n =nums2.length;
		int total = m + n;
		if(total % 2 != 0){
			return (double)findKth(nums1,0,m-1,nums2,0,n-1,total/2+1);
		}else{
			double x = findKth(nums1,0,m-1,nums2,0,n-1,total/2);
			double y = findKth(nums1,0,m-1,nums2,0,n-1,total/2+1);
			return (x+y)/2;
		}       
	  }
	private int findKth(int[] nums1, int astart, int aend, int[] nums2, int bstart,
			int bend, int k) {
		int m = aend - astart + 1;
		int n = bend - bstart + 1;
		if(m > n){
			return findKth(nums2,bstart,bend,nums1,astart,aend,k);
		}
		if(m == 0){
			return nums2[k-1];
		}
		if(k==1){
			return Math.min(nums1[astart], nums2[bstart]);
		}
		int partA = Math.min(k/2, m);
		int partB = k - partA;
		if(nums1[astart+partA-1]<nums2[bstart+partB-1]){
			return findKth(nums1,astart+partA,aend,nums2,bstart,bend,k-partA);
		}
		else if(nums1[astart+partA-1]>nums2[bstart+partB-1]){
			return findKth(nums1,astart,aend,nums2,bstart+partB,bend,k-partB);
		}
		else
			return nums1[astart+partA-1];
	}
}