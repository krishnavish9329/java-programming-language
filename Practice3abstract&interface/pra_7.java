interface tvRemote
{
    int incress_value(int a);
    int dicress_value(int b);
    int change_chanel(int c);
}
class tv implements tvRemote
{
    tv()
    {
        System.out.println("hello i am tv ");
    }
    
    public int incress_value(int a)
    {
        System.out.println("incress the valume by "+ a);
        return 0;
    }
    public int dicress_value(int b) 
    {
        System.out.println("dicress is valume by "+b);
        return 0;
    }
    public int change_chanel(int c)
    {
        System.out.println("change the chenal by "+c);
        return 0;
    }
}
public class pra_7 {
    public static void main(String[] args) {
        tv r =new tv();
        r.incress_value(4);
        r.dicress_value(-9);
        r.change_chanel(3);
    }
}
