import java.util.*;

class super_class
{
    public String animal;
    public super_class()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("this is super_class ");
        
        System.out.println("enter the name of animal : ");
         animal=s.nextLine();
    }
    
    
}
class sub_class extends super_class
{
    
    sub_class() 
    {
        System.out.println("this is sup_class ");
        System.out.println("name of animal is "+animal);
    }

}
public class first_inheritance
{
    public static void main(String[] args) {
        sub_class c=new sub_class();

    }
}