package JavaSession1;
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));
        System.out.println("Division: " + div(a, b));
        System.out.println("Modulo: " + mod(a, b));
    }
    static int add ( int a, int b){
        return a + b;
    }
    static int sub ( int a, int b){
        return a - b;
    }
    static int mul ( int a, int b){
        return a * b;
    }
    static int div ( int a, int b){
        return a / b;
    }
    static int mod ( int a, int b){
        return a % b;
    }
}