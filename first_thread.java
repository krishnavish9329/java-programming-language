class mythread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hello i am "+ i);
        }
    }

}
class mythread1 extends Thread
{
    public void run()
    {
        for(int i=1000;i<1010;i++)
        {
            System.out.println("hi" +i);
        }   
    }

}
class first_thread
{

    public static void main(String[] args) {
        mythread t1 =new mythread();
        mythread1 t2 =new mythread1();
        t1.start();
        t2.start();
    }
}