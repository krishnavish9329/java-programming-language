import java.util.Scanner;
public class nesting_try {
    public static void main(String []a)
    {
        int ar[] = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("ehter the  2 number for dividing : ");
        int am=sc.nextInt();
        int b=sc.nextInt();
    
        System.out.println("enter the element : ");

        for (int i = 0; i < 4; i++) 
        {
            ar[i] = sc.nextInt(); 
        }
        System.out.println("enter trhe index number :");
        int index=sc.nextInt();
        
        try {
            try
            {
                int c = am / b;
                System.out.println("the sume is : "+c);
            }
            catch(ArithmeticException r)
            {
                System.out.println("it's error :-");
                System.out.println(r);
            }
            System.out.println(ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException r)
        {
            System.out.println("sorry index doesn't exsit : ");
            System.out.println(r);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
