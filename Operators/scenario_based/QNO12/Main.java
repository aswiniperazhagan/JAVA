import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();
        System.out.print("Enter Loss: ");
        double loss = sc.nextDouble();
        double costPrice = sellingPrice + loss;
        System.out.println("Cost Price: " + costPrice);
    }
}
