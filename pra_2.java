package mypackage;
class rectangle
{
    rectangle()
    {
        System.out.println("i am rectanhle");
    }
}
class cuboid extends rectangle
{
    cuboid()
    {
        System.out.println("i am cuboid :--");
    }

}
public class pra_2
{
    public static void main(String[] args) {
        cuboid c =new cuboid();
        System.out.println("javac -d . pra_2");
        System.out.println("java mypackage/pra_2");
    }
    
}