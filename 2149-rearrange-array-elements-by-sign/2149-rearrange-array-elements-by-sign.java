class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        
        if(n==1 || n<1){
            return nums;
        }
        if(n==2){
            int temp=0,i=0;
            if(nums[i]<0){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            return nums;
        }
        int [] a = new int[n/2];
        int [] b = new int[n/2];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                a[j]=nums[i];
                j++;
            }else{
                b[k]=nums[i];
                k++;
            }        
        }
        j=0;
        k=0;
      for(int i=0;i<n;i++){
          if(i%2==0){
              nums[i]=b[j];
              j++;
          }else{
            nums[i]=a[k];
              k++;
          }
        }
        
        return nums;
    }
}