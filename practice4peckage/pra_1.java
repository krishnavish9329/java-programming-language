package clcu;
class calcutator
{
    public void add(int a,int b)
    {
        System.out.println("addtion of 2 number is "+(a+b));
    }
}
class sncalcutator
{
    public void add(int a ,int b)
    {
        System.out.println("addtion of sin of 2 number is "+Math.sin(a+b));
    }
}
class sncalcutator1
{
    public void add(int a )
    {
        System.out.println("the value of sin  is "+Math.sin(a));
    }
}
public class pra_1
{
    protected int proint = 26;
        int defint =41;
    public static void main(String[] args) {

        calcutator r =new calcutator();
        sncalcutator s=new sncalcutator();
        sncalcutator1 s1 =new sncalcutator1();
        r.add(2,8);
        s.add(20, 10);
        s1.add(60);

        System.out.println(" hello ");

    }
}