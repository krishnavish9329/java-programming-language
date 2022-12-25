abstract class Monkey
{
    abstract void jump();
    abstract void bite();
}
class human extends Monkey
{
    public void jump()
    {
        System.out.println("jump...");
    }
    public void bite()
    {
        System.out.println("bite....");
    }
    void hello ()
    {
        System.out.println("hello");
    }
}

public class pra_5 {
    public static void main(String[] args) {
        Monkey h =new human();
        h.jump();
        h.bite();
        //h.hello();
    }
}

