public class seconde_thread {
    public static void main(String[] args) {
        mythread t1 =new mythread();
        mythread1 t2 =new mythread1();
        t1.start();
        t2.start();
    }
}

class mythread extends Thread
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
class mythread1 extends Thread
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