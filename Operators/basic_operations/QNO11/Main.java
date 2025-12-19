import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        // Extracting the middle digit
        int middle = (num / 10) % 10;
        System.out.println("Middle digit: " + middle);
    }
}
