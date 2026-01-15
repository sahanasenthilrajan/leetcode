class Solution {
    public int subsetXORSum(int[] nums) {
   
        int bits = 0;
        for (int num : nums) {
            bits |= num; // Bitwise OR ellathayum
        }
        // Formula: bits * 2^(N-1)
        // '1 << (N-1)' naale 2 power N-1 than.
        return bits << (nums.length - 1);
    }
}
        
    