package ProblemSolvingSet1;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            String sub = "";

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (sub.indexOf(ch) != -1) {
                    break;
                }

                sub += ch;

                if (sub.length() > maxLength) {
                    maxLength = sub.length();
                }
            }
        }

        System.out.println("Length = " + maxLength);
    }
}