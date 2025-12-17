import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        if(ch1>ch2){
            char temp=ch1;
            ch1=ch2;
            ch2=temp;
        }
        for(char ch=(char)(ch1+1);ch<ch2;ch++){
            System.out.print(ch+" ");
        }
    }
}