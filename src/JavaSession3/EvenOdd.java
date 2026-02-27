package JavaSession3;
import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int OddCount = 0;
        int EvenCount = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
        }
        System.out.println("Even numbers count: " + EvenCount);
        System.out.println("Odd numbers count: " + OddCount);
    }
}