//# java-programming-language

import java.util.Scanner;
public class add3no {
    public static void main(String sf[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 3 number \n ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int sum=a+b+c;
        System.out.println("the sum is : "+ sum);
    }
}
