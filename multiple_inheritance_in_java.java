interface phone
{
    //void phone();
    void music();
    int map(int a);
    void call();
}
interface game extends phone
{
    //void game();
    void gta();
    void tic_tac_toe();
}
interface google extends phone
{
    //void google();
    void jbp();
    void mp();
    //void maharatha();
    //void vihar();
}
class phone1 implements  game,google
{
    phone1()
    {   
        System.out.println("i am phone1 : \n \t\t\t\t hello ,\n \t\t\t and hi everyone ");
    }
    
    public void music()
    {
        System.out.println("music .....................");
    }
    public int map(int a)
    {
        System.out.println("hello i am map "+ a );
        return a;
    }
    public  void call()
    {
        System.out.println("please call me .................");
    }
    public void gta()
    {
        System.out.println("i ma game og gta ");
    }
    public void tic_tac_toe()
    {
        System.out.println("i am tic tac toe game (cross and equal ) public ");
    }
    public  void jbp()
    {
        System.out.println("i ma google of jbp ");
    }
    public void mp()
    {
        System.out.println("i am google of mp ");
    }

}
class phone2 implements google
{
    phone2()
    {   
        System.out.println("i am phone2 : \n \t\t\t\t hello ,\n \t\t\t and hi everyone by phone2 ");
    }
    
    public void music()
    {
        System.out.println("music ......2...2.....2.......");
    }
    public int map(int a)
    {
        System.out.println("hello 2 i am map 2  "+2*a );
        return a;
    }
    public  void call()
    {
        System.out.println("please call me2 .....2.....2.....2..");
    }
    public  void jbp()
    {
        System.out.println("i ma google of jbp ");
    }
    public void mp()
    {
        System.out.println("i am google of mp ");
    }

}
public class multiple_inheritance_in_java {
    public static void main(String[] args) 
    {
        phone1 p1=new phone1();
        p1.music();
        p1.map(2);
        p1.call();
        p1.tic_tac_toe();
        p1.gta();
        p1.jbp();
        p1.mp();
        
        
        phone2 p2=new phone2();
        p2.music();
        p2.map(2);
        p2.call();
       // p2.tic_tac_toe();
        //p2.gta();
        
    }
}
