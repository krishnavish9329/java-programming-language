import java.util.*;

public class hashsetDemo
{
    public static void main(String []demo)
    {
        HashSet h=new HashSet();
        h.add(33);
        h.add(32);
        h.add(11);
        h.add(1);
        h.add("ktir");

        //System.out.println(h);
        for(Object e:h)
        {
            System.out.println(e);
        }

    }
}