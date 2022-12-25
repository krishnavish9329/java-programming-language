
import java.util.*;
public class LinkedList_with_generic
{
    public static void main(String[] args) {
        
        LinkedList <Double>ll =new LinkedList<Double>();
        LinkedList <Double>ll1 =new LinkedList<Double>();
        //ll.add("hello i am krishna ");
        ll1.add(33.3);
        ll1.add(33.0);
        ll1.add(333.4);


        ll.add(2.2);
        ll.add(1,3.3);
        ll.add(3.3);
        ll.add(0,6.6);
        ll.addFirst(12.34);
        ll.addLast(43.21);
        ll.addAll(0,ll1);
        for(Object e:ll)
        {
            System.out.println(e);
        }
        System.out.println();
        ll.add(0,444.22);
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }

    }
}