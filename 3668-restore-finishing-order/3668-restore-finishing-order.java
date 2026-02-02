class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int k = 0; // Use a separate index for the result array
        
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    ans[k] = order[i]; // Store it in the NEXT available slot
                    k++; // Move to the next slot in ans
                    break; // Optimization: stop looking once friend is found
                }
            }
        }
        return ans;
    }
}