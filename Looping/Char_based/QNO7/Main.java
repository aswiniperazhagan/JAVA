import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String binary=sc.next();
        int c0=0,c1=0;
        for(int i=0;i<binary.length();i++){
            char ch = binary.charAt(i);
            if(ch=='0')
            c0++;
            else if(ch=='1')
            c1++;
        }
        
        System.out.println("number of 0s: "+c0);
        System.out.println("number of 1s: "+c1);
        
    }
}