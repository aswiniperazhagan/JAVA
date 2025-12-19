import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in Kilometers: ");
        double km = sc.nextDouble();
        double meters = km * 1000;
        System.out.println("Distance in Meters: " + meters);
    }
}
