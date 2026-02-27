package JavaSession3;
import java.util.Scanner;
class SumOfElements {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
            int n = sc.nextInt();
            int arr [] = new int[n];
            System.out.println("Enter " + n + " elements:");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i =0; i<n;i++){
                sum =sum+arr[i];
            }
            System.out.println("Sum:"+sum);
        }
    }

