import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Speed (in km/hr): ");
        double speed = sc.nextDouble();
        System.out.print("Enter Time (in hours): ");
        double time = sc.nextDouble();
        double distance = speed * time;
        System.out.println("Distance Travelled: " + distance + " km");
    }
}
