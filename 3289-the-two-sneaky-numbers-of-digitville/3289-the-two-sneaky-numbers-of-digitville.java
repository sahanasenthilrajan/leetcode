import java.util.Arrays;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // 1. Array-va வரிசைப்படுத்தவும் (Sorting)
        Arrays.sort(nums);
        
        int[] result = new int[2]; // Namakku 2 numbers thaan venum
        int count = 0;
        
        // 2. Pakkam pakkathula irukka numbers-a check panna podhum
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                result[count] = nums[i];
                count++;
                
                // Rendu sneaky numbers kedachiduchuna loop-a nippatidalam
                if (count == 2) break;
            }
        }
        return result;
    }
}