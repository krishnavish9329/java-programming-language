//# java-programming-language

import java.util.*;
public class input
 {
    static int k=0;
    public static void main(String[] agr)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integer :");
        int a=s.nextInt();
        System.out.println("Enter the charecter :");
        char c = s.next().charAt(0);
        System.out.println("Enter the float :");
        float b=s.nextFloat();
        
        System.out.println("enter the String :");
        s.nextLine();
        String d=s.nextLine();
        

        System.out.println("output");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(k);
    }
}
