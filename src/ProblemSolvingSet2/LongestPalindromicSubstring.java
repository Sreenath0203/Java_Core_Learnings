package ProblemSolvingSet2;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "babad";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            String p1 = expand(s, i, i);
            if (p1.length() > ans.length()) {
                ans = p1;
            }

            // Even length palindrome
            String p2 = expand(s, i, i + 1);
            if (p2.length() > ans.length()) {
                ans = p2;
            }
        }

        System.out.println(ans);
    }

    public static String expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}