import java.util.*;
public class linkedList_demo
{
    public static void main(String[] args) {
        
        LinkedList ll =new LinkedList();
        ll.add("hello i am krishna ");
        ll.add(2);
        ll.add(1,3);
        ll.add(33);
        ll.add(0,66);
        ll.addFirst(1234);
        ll.addLast(4321);
        
        for(Object e:ll)
        {
            System.out.println(e);
        }
        System.out.println();
        ll.add(5,44422);
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }

    }
}