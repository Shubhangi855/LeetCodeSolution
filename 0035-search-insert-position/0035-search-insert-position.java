class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx=0;
        
        if(target<=nums[0]){
            return idx;
        }
        
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                idx = i;
                break;
            }
        }
        if(idx==0)
            idx = nums.length;
        
        return idx;
    }
}