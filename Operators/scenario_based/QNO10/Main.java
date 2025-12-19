import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        double da = sc.nextDouble();
        double grossSalary = basic + hra + da;
        System.out.println("Gross Salary of Employee: " + grossSalary);
    }
}
