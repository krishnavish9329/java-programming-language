//java-programming-language

public class all_operators {
 
    public static void main (String agg[])
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  first number : ");
        int a = s.nextInt();
        System.out.println("Enter the  seconde number : ");
        int b= s.nextInt();


        System.out.println("addition of two number :"+(a+b));
        System.out.println("subtraction of two number :"+(a-b));
        System.out.println("divitioon of two number :"+(a/b));
        System.out.println("multiplication of two number :"+(a*b));
        System.out.println("using > opareters :"+(a>b));
        System.out.println("using < opareters :"+(a<b));
        System.out.println("using >= opareters :"+(a>=b));
        System.out.println("using <= opareters :"+(a<=b));
        System.out.println("using == opareters :"+(a==b));
        System.out.println("using != opareters :"+(a!=b));
    }
}
