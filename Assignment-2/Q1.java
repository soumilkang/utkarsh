import java.util.*;
public class Q1{

    public static boolean palidrome(int num){
        int a=num,b;
        int reverse=0;
        int l = String.valueOf(num).length();
        for(int i=0;i<l;i=i+1)
        {
            b=num%10;
            reverse=reverse*10+b;
            num=num/10;
        }
        return a==reverse;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.print(palidrome(num));
    }
}

