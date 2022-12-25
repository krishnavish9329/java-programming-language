class employee
{
    int salary;
    String name;
    public void getSalary()
    {
        System.out.println(salary);
    }
    public void getname()
    {
        System.out.println(name);
    }
}
public class pra_1
{
    public static void main(String[] args)
    {
        employee kri=new employee();
        kri.salary=123;
        kri.name="krishna";
        kri.getSalary();
        kri.getname();

    }
}