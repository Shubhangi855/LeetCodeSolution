class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg =1;
        int n = nums.length;
        int [] sol = new int[n];
        
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                sol[neg]=nums[i];
                neg+=2;
            }else{
                sol[pos]=nums[i];
                pos+=2;
            }
        }
        return sol;
    }
}