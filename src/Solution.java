public class Solution {

    public int countPalindromicSubstrings(String s) {
        int ans = 0;
        /**
         * Iterate over the given input
         */
        for (int i = 0; i < s.length(); i++) {
            /**
             * for odd length palindromes
             */
            ans += checkPalindrome(s, i, i);
            /**
             * for even length palindromes
             */
            ans += checkPalindrome(s, i, i + 1);
        }
        /**
         * By now, we have counted all possible palindromic substrings within the given
         * string.
         */
        return ans;
    }

    /**
     * Check if the given string contains a palindrome
     * 
     * @param s     The string to check
     * @param left  The ith location of the index from the for loop within the
     *              calling
     *              method(first middle character)
     * @param right Another index location(second middle character)
     * @return
     */
    private int checkPalindrome(String s, int left, int right) {
        int count = 0;
        /**
         * While the left and right pointers are inbound(not out of bounds as in going
         * beyond the scope of the given input string on either side)and while the
         * character positions are same
         * 
         * In other words, this is the condition of a palindrome
         */
        while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            /**
             * by doing left-- and right++, we go further and further in our graph(in our
             * search of palindrome by going into the outer layers here)
             */
            left--;
            right++;
            count++;
        }
        return count;

    }

}
