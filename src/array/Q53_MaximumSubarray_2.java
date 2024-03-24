package array;

// 方法2 ： 分治法  using the divide and conquer（治，征服） approach
// 时间复杂度为 O(n)，渐进空间复杂度为 O(log ⁡n)
public class Q53_MaximumSubarray_2 {
	    public class Status {
	        public int lSum, rSum, mSum, iSum;
             // Status是自定义的，不是内置/特定的名字
	        public Status(int lSum, int rSum, int mSum, int iSum) {
	            this.lSum = lSum;
	            this.rSum = rSum;
	            this.mSum = mSum;
	            this.iSum = iSum;
	        }
	    }

	    public int maxSubArray(int[] nums) {
	        return getInfo(nums, 0, nums.length - 1).mSum;
	    }

	    public Status getInfo(int[] a, int l, int r) {
	        if (l == r) {
	            return new Status(a[l], a[l], a[l], a[l]);
	        }
	        int m = (l + r) >> 1; // 也就是(l + r)/2，如果l=0,r=3,java会丢弃小数部分也就最后是1而不是1.5
	        Status lSub = getInfo(a, l, m); 
	        Status rSub = getInfo(a, m + 1, r);
	        return pushUp(lSub, rSub);
	    }

	    public Status pushUp(Status l, Status r) {
	        int iSum = l.iSum + r.iSum;
	        int lSum = Math.max(l.lSum, l.iSum + r.lSum);
	        int rSum = Math.max(r.rSum, r.iSum + l.rSum);
	        int mSum = Math.max(Math.max(l.mSum, r.mSum), l.rSum + r.lSum);
	        return new Status(lSum, rSum, mSum, iSum);
	    }
	}
 



