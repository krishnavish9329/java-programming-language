class greeting extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("good moring ");
        }
    }
}
class greeting1 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("WELCOME ");
        }
    }
}
public class pra_1
{
    public static void main(String[] args) {
        greeting g =new greeting();
        greeting1 w =new greeting1();
        g.start();
        w.start();

    }
}