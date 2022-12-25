import java.util.*;
class employee {
    //private String name;
    //public String name;
    protected String name;


    
} 
class employee1 extends employee
{
    public void setprint()
    {
    System.out.println("this is my name "+name);
    }
}
public class access_modifirs
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        employee1 e= new employee1();
        e.name="krishna"; 
        e.setprint();
    }
}