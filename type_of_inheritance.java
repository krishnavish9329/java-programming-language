import java.util.*;

class super_class//base class
{
    super_class()
    {
        System.out.println("i am super class hi");
    }
}
class drive_class extends super_class
{
    drive_class()
    {
        System.out.println("i am drive class");
    }
}
class single extends super_class
{
    single()
    {
        System.out.println("hi i am single inheritance : ");
    }

}
class mulitlavel extends drive_class
{
    mulitlavel()
    {
        System.out.println("i am mulilavel inheritance");
    }
}
class hierarchlal extends super_class
{
    hierarchlal()
    {
        System.out.println(" i am hierarchlal");
    }
}
class hierarchlal1 extends super_class
{
    hierarchlal1()
    {
        System.out.println(" i am hierarchlal1");
    }
} 
class hybrid extends super_class 
{
    hybrid()
    {
        System.out.println(" he i am hybrid inheritance ");
        System.out.println("i am combination of another inheritance ");
    }
}
public class type_of_inheritance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1) single inheritance \n 2)multilavel inheritance \n 3) hierarchlal inheritance \n4) hybrid inheritance 50 multipal inheritance \n java isn't suppot multipal inheritance");
        int a;
        a=s.nextInt();
        System.out.println("\n \n \n");
            switch(a)
            {
                case 1:new single();
                       break;
                case 2:new mulitlavel();
                       break;
                case 3:new hierarchlal();
                       new hierarchlal1();
                       break;
                case 4:new hybrid();
                       break;
                default : System.out.println("wrong input");
                          System.out.println("you give me  only 1,2,3,4 for input ");
            }

    }
}
