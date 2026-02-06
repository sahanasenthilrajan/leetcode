class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentCount = 0;

        for (String word : words) {
            boolean isMatch = true;
            
            // Check every character in the current word
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                
                // Brute force check: does 'allowed' contain this letter?
                if (allowed.indexOf(letter) == -1) {
                    isMatch = false;
                    break; // Stop checking this word
                }
            }
            
            if (isMatch) {
                consistentCount++;
            }
        }
        
        return consistentCount;
    }
}