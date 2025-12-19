import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoes = sc.nextInt();
        int price = sc.nextInt();
        System.out.print((mangoes-(mangoes/3)+(mangoes%3))*price);
    }
}

