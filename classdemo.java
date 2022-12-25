class Employee
{
    int id;
    String name;
    public void printDetels()
    {
        System.out.println("and my name is :"+name);
        System.out.println("my id name is : "+ id);
    }
}
public class classdemo
{
    public static void main(String[] args) {
        System.out.println("This is custom class : ");
        Employee kri =new Employee();
        kri.id=85;
        kri.name="krishna";
        kri.printDetels();
    }
}