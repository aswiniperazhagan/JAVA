import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Original Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();
        double discountAmount = (price * discount) / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Price After Discount: " + finalPrice);
    }
}
