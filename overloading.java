class circle
{
    void circle(int r,int b)
    {
     System.out.println("multiplication is :"+(r*b));
    }
}
class area extends circle
{
    void circle(int r)
    {
        System.out.println("ara of sircle is : "+(3.141*r*r));
    }
}
public class overloading
{
    public static void main(String[] args) {
        area a=new area();
        a.circle(4,5);
    }
}