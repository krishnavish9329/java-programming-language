
class circle
{
    void circle(int r)
    {
     System.out.println(": "+(3.141*r*r));
    }
}
class area extends circle
{
    void circle(int r)
    {
        System.out.println("ara of sircle is : "+(3.141*r*r));
    }
}
public class overriding_advance
{
    public static void main(String[] args) {
        area a=new area();
        a.circle(4);
    }
}