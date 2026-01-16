class Solution {
    public String reversePrefix(String s, int k) {
        // Edge case: Oruvelai 'k' value string length vida perisa irundha,
        // moththa string-ayum reverse panniduvom.
        if (k >= s.length()) {
            return new StringBuilder(s).reverse().toString();
        }

        // Step 1: Mudhal 'k' characters eduthu reverse panrom
        // s.substring(0, k) -> "abc"
        StringBuilder sb = new StringBuilder(s.substring(0, k));
        sb.reverse(); // "cba" aagirum

        // Step 2: Meethi irukura characters ah apdiye add panrom
        // s.substring(k) -> "defg"
        sb.append(s.substring(k));

        // Step 3: String ah convert panni return panrom
        return sb.toString();
    }
}