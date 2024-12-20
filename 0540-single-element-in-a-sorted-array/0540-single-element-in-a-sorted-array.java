class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        int idx = 0;
        for(int i=1; i<nums.length-1; i++){            
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                idx=i;
                break;
            }
        }
        
        if(idx==0 && nums[nums.length-1]!=nums[nums.length-2]){
            idx = nums.length-1;
        }
        return nums[idx];
    }
}