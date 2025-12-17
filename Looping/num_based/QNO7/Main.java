import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, temp, rev = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;  
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
