import java.util.*;
class table extends Thread
{
    public void run()
    {
        System.out.println("enter the number :");
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int i=0;
        while(i<11)
        {
            System.out.println(a+"* "+i +"="+a*i);
            i++;
        }
    }
}
class table1 extends Thread
{
    public void run()
    {
        System.out.println("enter the number :");
        Scanner s1 =new Scanner(System.in);
        int a=s1.nextInt();
        int i=0;
        while(i<11)
        {
            System.out.println(a+"* "+i +"="+a*i);
            i++;
        }
    }
}
public class priority_id {
    public static void main(String[] args) {
        table t=new table();
        table1 t1=new table1();
        t.start();
        t1.start();
        System.out.println("the id of thread is "+t.getId());
        System.out.println("the id of thread is "+t1.getId());
        System.out.println("the id of thread is "+t.getPriority());
        System.out.println("the id of thread is "+t1.getPriority());
    }
    
}