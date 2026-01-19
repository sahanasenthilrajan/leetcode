class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int[] counts = new int[101]; // Stores how many times we've seen each number

        for (int num : nums) {
            // 1. Add the number of times we've seen 'num' previously to our total
            goodPairs += counts[num];
            
            // 2. Increment the count for 'num' because we just saw it again
            counts[num]++;
        }
        
        return goodPairs;
    }
}