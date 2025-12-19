import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Minutes: ");
        int minutes = sc.nextInt();
        int seconds = minutes * 60;
        System.out.println("Seconds: " + seconds);
    }
}
