class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            // Add the previous number to the current number
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}