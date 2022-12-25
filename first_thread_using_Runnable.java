class mythread implements Runnable
{
    public void run()
    {
        int a=2;
        for(int i=1;i<11;i++)
        {
            System.out.println(a +"X"+ i+"="+(a*i));
        }
    }

}
class mythread1 implements Runnable
{
    public void run()
    {
        int a=7;
        for(int i=1;i<11;i++)
        {
            System.out.println(a +"X"+ i+"="+(a*i));
        }
    }

}

public class first_thread_using_Runnable {
    public static void main(String[] args) {
        mythread bullet1 =new mythread();
        mythread1 bullet2 =new mythread1();
        Thread gun1 =new Thread(bullet1);
        Thread gun2 =new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}