import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter denominator: ");
        double num2 = sc.nextDouble();
        double quotient = num1 / num2;
        System.out.println("The quotient of the two numbers is: " + quotient);
    }
}