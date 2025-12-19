import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of batches: ");
        int batches = sc.nextInt();
        System.out.print("Enter number of cakes made per batch: ");
        int cakesPerBatch = sc.nextInt();
        int totalCakes = batches * cakesPerBatch;
        System.out.println("Total Cakes Made: " + totalCakes);
    }
}
