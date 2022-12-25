import java.util.*;
public class pra_3 {
    public static void main(String []q)
    {
        boolean flag=true;
        int marks[]=new int[3];
        marks[0]=3;
        marks[1]=30;
        marks[2]=40;
        Scanner s=new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5)
        {
            try{
                System.out.println("Enter the index number :");
                index=s.nextInt();
                System.out.println("the value of marks[index] is "+marks[index]);
                break;
            }
            catch(Exception r)
            {
                System.out.println("invail index ");
                System.out.println(r);
                i++;
            }
        }
        if(i>=5)
        System.out.println("error");

    }
}
