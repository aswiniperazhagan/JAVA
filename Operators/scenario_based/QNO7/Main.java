import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Candies: ");
        int candies = sc.nextInt();
        System.out.print("Enter Number of People: ");
        int people = sc.nextInt();
        int eachPersonGets = candies / people;
        int leftover = candies % people;
        System.out.println("Each Person Gets: " + eachPersonGets + " candies");
        System.out.println("Leftover Candies: " + leftover);
    }
}
