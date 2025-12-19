import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int price = sc.nextInt();
        System.out.print((pens/price)*3*price+(pens%price)*price);
    }
}

