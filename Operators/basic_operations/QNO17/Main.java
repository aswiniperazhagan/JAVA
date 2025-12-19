import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Condition using bitwise AND
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println("Is the number a power of 2? " + isPowerOfTwo);
    }
}
