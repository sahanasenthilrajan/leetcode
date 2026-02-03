import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark visited indices by negating the value
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value because the number might have been negated
            int val = Math.abs(nums[i]) - 1;
            
            // If the value at that index is positive, make it negative
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        // Step 2: Identify indices that are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                // The number (index + 1) never appeared
                result.add(i + 1);
            }
        }

        return result;
    }
}