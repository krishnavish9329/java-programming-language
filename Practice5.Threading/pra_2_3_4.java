
class greeting extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<5)
        {
            try 
            {
                System.out.println("good moring ");
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
}

class greeting1 extends Thread
{
    @Override
    public void run()
    { 
        int i=0;
        while(i<1)
        {
            System.out.println("WELCOME ");
            i++;
        }
    }
}
public class pra_2_3_4
{
    public static void main(String[] args) {
        greeting g =new greeting();
        greeting1 w =new greeting1();
        g.setPriority(Thread.MAX_PRIORITY);
        w.setPriority(3);
        System.out.println(w.getPriority());
        System.out.println(g.getPriority());
        g.start();
        w.start();
        System.out.println("sta "+g.getState());

        System.out.println(Thread.currentThread());
        //System.out.println(Thread.CurrentThread.getState());
        

    }
}