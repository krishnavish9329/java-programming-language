import java.util.*;

public class try_catch {
    public static void main(String[] s) {
        int ar[] = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("enter");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            int c = a / b;
            System.out.println(ar[5]);
            System.out.println("hello i am try block: ");
        }
        catch(ArrayIndexOutOfBoundsException r)
        {
            System.out.println("asa nahi ho sakta hai ");
        } 
        catch(ArithmeticException r)
        {
            System.out.println("more then one catch block \n        it posible more the one cathch block ::");

        }
        catch (Exception e) {
            System.out.println("hi i am catch block  ");
            System.out.println(e);
        }
    }
}
