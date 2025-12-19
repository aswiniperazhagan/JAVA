import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw: ");
        int amount = sc.nextInt();
        int notes2000 = amount / 2000;
        int remainder1 = amount % 2000;
        int notes500 = remainder1 / 500;
        int remainder2 = remainder1 % 500;
        int notes200 = remainder2 / 200;
        int remainder3 = remainder2 % 200;
        int notes100 = remainder3 / 100;
        int remainder4 = remainder3 % 100;
        System.out.println("2000₹ Notes: " + notes2000);
        System.out.println("500₹ Notes: " + notes500);
        System.out.println("200₹ Notes: " + notes200);
        System.out.println("100₹ Notes: " + notes100);
        System.out.println("Remaining Amount: " + remainder4);
    }
}
