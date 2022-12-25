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
}

public class pra_3 {
    public static void main(String[] args) {
        human h =new human();
        h.jump();
        h.bite();
    }
}
