import java.util.Scanner;
public class AllExceptLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int result = N / 10;
        System.out.println("All digits except the last digit: " + result);
    }
}
