class phone
{
    public void showTime()
    {
        System.out.println("time is 8 clock");
    }
    public void on()
    {
        System.out.println("on the phone");
    }
}
class smartphone extends phone
{
    smartphone()
    {
        System.out.println("i am smartphone ");
    }
    public void music()
    {
        System.out.println("on  song ");
    }
    public void on()
    {
        System.out.println("on the smartphone");
    }

}
public class dynamic_method
{
    public static void main(String[] args) {
     phone s =new smartphone();
     s.showTime();   
     s.on();
     //s.music();//it not allowa.
     //smartphone p=new smartphone();
     //p.music();

    }
    
}