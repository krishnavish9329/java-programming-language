abstract class phone
{
    phone()
    {
        System.out.println("this is phone ");
    }
    abstract void music();
    abstract void call();
}
class smartphone extends phone
{
    smartphone()
    {
        System.out.println("i am constructer .");

    }
    public void music()
    {
        System.out.println("music ......is ........");
    }
    void call()
    {
        System.out.println("call karna hai ....");
    }
    
}
class mi extends smartphone
{
    void hello()
    {
        System.out.println("hello");
    }
}
public class abstract_class
{
    public static void main(String[] args) {
        smartphone s= new mi();
        s.music();
        s.call();
        mi i=new mi();
        i.hello();
        i.music();
    }
}