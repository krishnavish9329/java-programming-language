import java.util.*;
//without generics
public class Arraylist_collection
{
    public static void main(String[] arge)
    {
        ArrayList al=new ArrayList();
        ArrayList al1=new ArrayList();
        al1.add(12);
        al1.add(14);
        al1.add(13);
        al1.add(13);
        al1.add(0,"sangea");
        al1.add(0,true);
        al1.add(false);
        //al1.clear();
        
        al.addAll(al1);
        al.add("krishna ");
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(4);

        
        
        // System.out.println(al.contains(3));
        // System.out.println(al1.contains("krishna"));
        for(Object a:al1)
        {
            System.out.println(a);
        }
         System.out.println(al1.indexOf(13));
         System.out.println(al1.lastIndexOf(13));


        
        //System.out.println(al);
        // for(int i=0 ;i<al.size();i++)
        // {
        // System.out.println(al.get(i));
        // }
    }
}