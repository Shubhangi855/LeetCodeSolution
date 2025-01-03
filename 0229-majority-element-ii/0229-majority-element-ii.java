class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a=new ArrayList<>();
        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1==0 && el2!=nums[i])
            {
                 el1=nums[i];
                count1=1;
            }
            else if (count2==0 && el1!=nums[i])
            {
                el2=nums[i];
                count2=1;
            }
            else if(nums[i]==el1)
            {
                count1++;
            }
            else if (nums[i]==el2)
            {
                count2++;
            }
            else
            {
                count2--;
                count1--;
            }
        }     
        int c1=0;
        int c2=0;
       for(int i=0;i<nums.length;i++)
       {
             if(nums[i]==el1)
             {
                c1++;
             }
             if(nums[i]==el2)
             {
                c2++;
             }
       }
       int mini=(nums.length/3)+1;
       if(c1>=mini)
       {
        a.add(el1);
       }
       if(c2>=mini)
       {
        a.add(el2);
       }
        return a;
        
    }
}