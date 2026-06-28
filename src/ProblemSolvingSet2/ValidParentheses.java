package ProblemSolvingSet2;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }

                char open = stack.pop();

                if ((ch == ')' && open != '(') ||
                        (ch == '}' && open != '{') ||
                        (ch == ']' && open != '[')) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty());
    }
}