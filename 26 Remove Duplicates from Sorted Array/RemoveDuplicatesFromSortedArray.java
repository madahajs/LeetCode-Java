public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(nums == null){
            return 0;
        }
        if(n == 0){
           return 0; 
        }
        int index = 0;
        for(int i =1;in;i++){
            if(nums[index] != nums[i]){
                nums[++index] = nums[i];
             }
         }
        return index+1;
    }
}