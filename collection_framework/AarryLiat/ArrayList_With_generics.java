import java.util.*;
public class ArrayList_With_generics 
{
    public static void main(String[] arge)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<String> als=new ArrayList<String>();
        als.add("krishna");
        als.add("rohit");
        als.add("mayank");
        als.add("monkey");
        als.add(0,"sangam");
        // als.add(0,true);
        // als.add(false);
        // als.clear();
        
        //al.addAll(al1);
        //al.add("krishna ");
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(4);

        
        
        
        //System.out.println(als.contains("krishna"));
        for(Object a:als)
        {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(als.remove("krishna"));
        
        for(Object a:als)
        {
            System.out.print(a);
            System.out.print(" ");
        }
       
        System.out.println();
        for(int i=0 ;i<al.size();i++)
        {
        System.out.print(al.get(i));
        System.out.print(" ");
        }
    }
}
