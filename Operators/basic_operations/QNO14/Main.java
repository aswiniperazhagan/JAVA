import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int cube = num * num * num; // calculating cube
        System.out.println("Cube of " + num + " is: " + cube);
    }
}
