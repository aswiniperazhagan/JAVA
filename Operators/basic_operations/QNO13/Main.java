import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num; // calculating square
        System.out.println("Square of " + num + " is: " + square);
    }
}
