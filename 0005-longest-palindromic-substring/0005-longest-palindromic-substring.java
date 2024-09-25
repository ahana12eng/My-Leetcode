class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s; // For strings of length 1 or 0, return the string itself
        }

        String longestPalindrome = "";

        for (int i = 1; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }

            // Check for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i-1, i );
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }

        return longestPalindrome;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the substring that is the longest palindrome found
        return s.substring(left + 1, right);
    }
}