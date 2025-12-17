import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println("Perfect square");
                return;
            }
        }
        System.out.println("Not a perfect square");
    }
}


