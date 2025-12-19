import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter Profit: ");
        double profit = sc.nextDouble();
        double sellingPrice = costPrice + profit;
        System.out.println("Selling Price: " + sellingPrice);
    }
}
