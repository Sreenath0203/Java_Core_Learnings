package BaseClassesForProject;
import java.util.Scanner;
class Purchase {
    int purchaseId;
    String dateTime;
    String productName;
    String productId;
    int quantity;
    double price;
    double totalPrice;
    String purchasedFrom;
}
public class PurchaseSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Purchase");
        System.out.println("2. Exit");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            Purchase[] p = new Purchase[n];

            for (int i = 0; i < n; i++) {

                p[i] = new Purchase();
                p[i].purchaseId = i+1;

                System.out.println("\nEnter details for Product " + (i+1));

                System.out.print("Enter Date and Time: ");
                p[i].dateTime = sc.nextLine();

                System.out.print("Enter Product Name: ");
                p[i].productName = sc.nextLine();

                System.out.print("Enter Product ID: ");
                p[i].productId = sc.nextLine();

                System.out.print("Enter Quantity: ");
                p[i].quantity = sc.nextInt();

                System.out.print("Enter Product Price: ");
                p[i].price = sc.nextDouble();
                sc.nextLine();

                p[i].totalPrice = p[i].quantity * p[i].price;

                System.out.print("Purchased From: ");
                p[i].purchasedFrom = sc.nextLine();
            }

            System.out.println("\n---- All Purchased Products ----");

            for (int i = 0; i < n; i++) {

                System.out.println("\nPurchase ID: " + p[i].purchaseId);
                System.out.println("Date & Time: " + p[i].dateTime);
                System.out.println("Product Name: " + p[i].productName);
                System.out.println("Product ID: " + p[i].productId);
                System.out.println("Quantity: " + p[i].quantity);
                System.out.println("Price: " + p[i].price);
                System.out.println("Total Price: " + p[i].totalPrice);
                System.out.println("Purchased From: " + p[i].purchasedFrom);
            }
        }

        sc.close();
    }
}
