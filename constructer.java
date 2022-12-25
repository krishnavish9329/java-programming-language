class bick
{
    public bick()
    {
        System.out.println("hello i am constructer ");
    }
    public bick(int ...array)
    {
        int sum=0;
        for(int element:array)
        {
            sum += element;
        }
        System.out.println(sum);
        System.out.println("hello i am constructer with permiter & overloaded constructer");
    }

}
class employee
{
    public int id;
    public String name;
    public employee()
    {
        id=10000;
        name="name...........";
    }    
    public int  employee(int a,int b)
    {
        return(a+b);
    }
    public void getprint()
    {
    System.out.println("employee id is :"+id);
    System.out.println("employee name is :"+name);
    }
}
public class constructer
{
    public static void main(String[] args) {
        new bick(2,3,4,1);
        employee e=new employee();
       // e.id=22;
       // e.name="kridhns";
       System.out.println(e.employee(3, 2));
       //e.getprint();
    }
}