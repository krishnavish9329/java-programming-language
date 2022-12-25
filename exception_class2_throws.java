import java.util.*;
 
class NegativeRediusExeption extends Exception {
    public String toString() { 
        return super.toString() + " redius cannot be Negetive  ";
    }
    public String getMessage() {
        return super.getMessage() + "redius cannot be Negetive ";
    }
}

public class exception_class2_throws {
    public static double area(int r) throws  NegativeRediusExeption
    {if(r<0)
        {
            throw new NegativeRediusExeption();
        }
        double result =Math.PI*r*r;
        return result;

    }
    public static void main(String e[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the area of retius :");
        int a;
        a = s.nextInt();
        try {
            double ar =area(a);
            System.out.println(ar);
        } catch (Exception z) {
            System.out.println(z);
            //System.out.println(z.getMessage());
            //System.out.println(z.toString());
        }
    }
}

