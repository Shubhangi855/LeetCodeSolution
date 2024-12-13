class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        int idx=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
            idx=i;
        }
        if(idx==nums.length-2 && nums[nums.length-1]>nums[nums.length-2]){
            idx = nums.length-1;
        }
        return idx;
    }
}