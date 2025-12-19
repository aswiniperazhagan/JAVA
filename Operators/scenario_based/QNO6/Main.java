import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in Bytes: ");
        long bytes = sc.nextLong();
        long bits = bytes * 8;
        System.out.println("Bits: " + bits);
    }
}
