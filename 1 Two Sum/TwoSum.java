public class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(hm.containsKey(target-nums[i])){
				int[] res = {hm.get(target-nums[i])+1,i+1};
				return res;
			}
			hm.put(nums[i], i);
		}
		
		return null;
    }
}