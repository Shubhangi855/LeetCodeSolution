class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < nums2.length; i++) {
            // for monotonic-ascending queue, we maintain the lowest element at the top
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put (stack.pop(), nums2[i]);
            }
            
            stack.push(nums2[i]);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return nums1;
    }
}