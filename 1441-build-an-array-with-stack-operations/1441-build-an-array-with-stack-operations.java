import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int targetIndex = 0; // Pointer for the target array
        
        for (int i = 1; i <= n && targetIndex < target.length; i++) {
            // Rule 1: Always push the current stream number
            result.add("Push");
            
            // If it matches what we need, move to the next target
            if (i == target[targetIndex]) {
                targetIndex++;
            } 
            // Rule 2: If it doesn't match, pop it immediately
            else {
                result.add("Pop");
            }
        }
        
        return result;
    }
}