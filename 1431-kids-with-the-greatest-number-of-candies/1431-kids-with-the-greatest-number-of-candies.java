import java.util.ArrayList; // Needed for List
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // --- STEP 1: Find the Max ---
        int max = 0;
        for(int candy : candies) { // This is a "for-each" loop (shortcut)
            if(candy > max) {
                max = candy;
            }
        }
        
        // --- STEP 2: The "What If" Check ---
        List<Boolean> result = new ArrayList<>(); // Create the list
        
        for(int i = 0; i < candies.length; i++) {
            // Check: (Current Candy + Extra) >= Max
            if(candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}