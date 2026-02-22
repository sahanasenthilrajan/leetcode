class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        
        // Step 1: Count frequencies of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxVowelFreq = 0;
        int maxConsonantFreq = 0;

        // Step 2: Iterate through the alphabet to find max frequencies
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;

            char ch = (char) (i + 'a');
            
            // Identify if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (freq[i] > maxVowelFreq) {
                    maxVowelFreq = freq[i];
                }
            } else {
                // It's a consonant
                if (freq[i] > maxConsonantFreq) {
                    maxConsonantFreq = freq[i];
                }
            }
        }

        return maxVowelFreq + maxConsonantFreq;
    }
}