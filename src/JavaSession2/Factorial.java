package JavaSession2;
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int f = 1;
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        System.out.println("Factorial:" + f);
    }
}5
