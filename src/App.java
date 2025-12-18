public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given a string s, return the number of palindromic substrings in it.
         * 
         * A string is a palindrome when it reads the same backward as forward.
         * 
         * A substring is a contiguous sequence of characters within the string.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "abc"
         * Output: 3
         * Explanation: Three palindromic strings: "a", "b", "c".
         * 
         * Example 2:
         * 
         * Input: s = "aaa"
         * Output: 6
         * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
         */
        System.out.println("Hello, World!");
        // String input = "yxabbaxz";
        String input = "aaa";
        Solution solution = new Solution();
        int result = solution.countPalindromicSubstrings(input);
        System.out.println(
                "The given input is: " + input + " and the number of palindromic substrings it contains is: " + result);
    }
}
