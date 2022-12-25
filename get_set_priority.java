
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
class get_set_priority
{

    public static void main(String[] args) {
        mythread t1 =new mythread();
        mythread1 t2 =new mythread1();
        /*  priority is betbeen of 1 to 10*/
        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(5);
        //t2.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(2);
        
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        t2.start();
        System.out.println("the priority is "+ t1.getPriority()); //bydefoult all priority is 5(minimum)
        System.out.println("the priority is "+ t2.getPriority());
    }
}