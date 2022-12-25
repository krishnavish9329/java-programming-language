# java-programming-language

import java.util.*;

public class array_number {
    public static void main(String[] args) {
        int[] number =new int[5];
        number[0]=1;
        number[1]=4;
        number[2]=2;
        System.out.println(Arrays.toString(number));

        String x="1";
        int y=Integer.parseInt(x)+2;
        System.out.println(y);

        int result=Math.round(4.66F);
        System.out.println(result);

        double r=Math.random()*100;   //random number generator by java compailer
        System.out.println(r);

        int r1=(int)Math.round(Math.random()*10);
        System.out.println(r1);

        
    }   
}
