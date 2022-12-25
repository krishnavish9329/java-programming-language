abstract class pen
{
    abstract void  writer();
    abstract void refill();
}
class copy extends pen
{
    public void writer(){
        System.out.println(" i'm write by pen ");
    }
    public void refill()
    {
        System.out.println("this is refill ");
    }
}
public class pra_1
{
    public static void main(String[] args) {
        copy c =new copy();
        c.writer();
        c.refill();
    }

}