class single
{
    void add(int a,int b)
    {
        System.out.println("multiplication the number "+ (a*b));
    }
}
class over extends single
{
    over(int a ,int b)
    {
        System.out.println("hi i am constructer  and  a divited b "+(a/b));
    }
    void add(int a,int b)
    {
        System.out.println("add the number "+ (a+b));
    }

}
public class overriding {
    public static void main(String[] args) {
        over o =new over(2,5);
        o.add(2,4);
    }
}
