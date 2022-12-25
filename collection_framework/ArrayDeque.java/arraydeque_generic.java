import java.util.*;
public class arraydeque_generic
{
    public static void main(String[] args) {
        
        ArrayDeque<String> st=new ArrayDeque<>();
        ArrayDeque<String> st1=new ArrayDeque<>();
        st1.addFirst("i am krishnan");
        st1.addLast("i am pusing btach with cse");

        st.addAll(st1);
        st.add("krishna");
        st.add("sangam");
        st.add("sangam");


        for(Object al: st)
        {
            System.out.println(al);
        }
        System.out.println(st.getFirst());
        System.out.println(st.getLast());
        
    }

}