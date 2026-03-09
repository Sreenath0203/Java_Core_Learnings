package JavaSession4;
public class DigitSum {
    public static int sumDigits(String str) {
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String input = "12345";
        System.out.println(sumDigits(input));
    }
}