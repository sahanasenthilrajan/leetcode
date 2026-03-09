import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // 1. Sort the array to bring close numbers together
        Arrays.sort(nums);
        
        int maxSum = 0;
        
        // 2. Sum up every second element starting from index 0
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}