interface cycle
{
    int a=90;
    void hello();
}
interface bicycle extends cycle
{
   // int a=33;
    void applybreack(int decrement);
    void speedup(int increment);
}
class ekcycle implements bicycle
{
    
    public void applybreack(int decrement)
    {
        System.out.println("applybreack...");
    }
    public void speedup(int increment)
    {
        System.out.println("increments of bicke ...");
    }
    public void hello()
    {
        //a=90;
        System.out.println("hello"+a);
    }
}
public class interface1 {
    public static void main(String[] args) {
        ekcycle e=new ekcycle();
        e.applybreack(2);
        e.speedup(3);
        e.hello();
    }
}
