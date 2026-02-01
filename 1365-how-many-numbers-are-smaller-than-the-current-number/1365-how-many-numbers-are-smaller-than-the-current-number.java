class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0; 
            for (int j = 0; j < nums.length; j++) {
                // We compare the current number (i) with every other number (j)
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            // Store the final count for this specific position
            ans[i] = count;
        }
        
        return ans; // This is the piece that was missing!
    }
}