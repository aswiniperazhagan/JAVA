import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        // Extracting last digit
        int last = num % 10;
        // Extracting first digit
        int first = num / 100;
        // Sum of first and last digit
        int sum = first + last;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
