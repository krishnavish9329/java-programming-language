public class pra_1_2
{
    public static void main(String a[])
    {
        //a=02//it syntax erroe
        int are=20;
        int you_born=2000-20;//it logical error
        //System.out.println(2/0); //it s=runtime error

        //problem 2
        try{
            int pa=2000000077/0;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("hehe");
        }
        catch(ArithmeticException e)
        {
            System.out.println("hello");
        }
    }
}