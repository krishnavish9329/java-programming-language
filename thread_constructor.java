class MyThread extends Thread
{
    String name ;
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<10)
        {
        System.out.println("my name is Thread "+ this.getName());
        i++;
        }

    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyThread s= new MyThread("krishna kumar");
        MyThread s1= new MyThread("Sangam");
        s.start();
        s1.start();
        System.out.println("the id of thread is "+s.getId());
        System.out.println("the id of thread is "+s1.getId());
        System.out.println("the id of thread is "+s.getPriority());
        System.out.println("the id of thread is "+s1.getPriority());



    }
}
