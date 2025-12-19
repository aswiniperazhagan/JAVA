import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Bill Amount: ");
        double totalBill = sc.nextDouble();
        double share = totalBill / 3;
        System.out.println("Each Friend Should Pay: " + share);
    }
}
