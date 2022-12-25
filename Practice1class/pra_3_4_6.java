import java.util.*;
class squar
{
    double side;

    void SArea()
    {
        System.out.println("area of squar :"+ (side*side));
    }
    void sperimeter()
    {
        System.out.println("perimeter of squar ';"+(4*side));
    }
}
class rectangle
{ 
    double side_l;
    double side_w;

    void SArea()
    {
        System.out.println("area of rectangle :"+ (side_l*side_w));//width
    }
    void sperimeter()
    {
        System.out.println("perimeter of rectangle ';"+(2*(side_l+side_w)));
    }
}
 
class circle
{ 
    double redius;

    void SArea()
    {
        System.out.println("area of circle :"+ (3.141*redius*redius));//width
    }
    void sperimeter()
    {
        System.out.println("perimeter of circle : "+(2*3.141*redius));
    }
}
public class pra_3_4_6 {
    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        /*squar s=new squar();
        System.out.println("enter the side");
        s.side =r.nextDouble();
        s.SArea();
        s.sperimeter();*/

        /*rectangle s=new rectangle();
        System.out.println("enter the length and width");
        s.side_l =r.nextDouble();
        s.side_w=r.nextDouble();
        s.SArea();
        s.sperimeter();*/
        
        circle s=new circle();
        System.out.println("enter the redius of circle : ");
        s.redius =r.nextDouble();
        s.SArea();
        s.sperimeter();
        

    }
}
