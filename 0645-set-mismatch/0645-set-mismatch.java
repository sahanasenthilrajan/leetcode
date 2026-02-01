class Solution {
    public int[] findErrorNums(int[] nums) {
        // We create an array to keep track of counts. 
        // Size is nums.length + 1 so we can use the numbers as indices directly.
        int[] counts = new int[nums.length + 1];
        
        for (int num : nums) {
            counts[num]++;
        }

        int duplicate = -1;
        int missing = -1;

        // Loop from 1 to n to check our "buckets"
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == 2) {
                duplicate = i;
            } else if (counts[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}