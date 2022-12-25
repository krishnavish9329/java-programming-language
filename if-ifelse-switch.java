//# java-programming-language
import java.util.Scanner;
public class if_else {

    public  static void main(String g[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the 3 number :\n");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        if(a>b && a>c)
        {System.out.println(a+" greater ");}
        else if(b>a && b>c)
        {System.out.println(b+" greater ");}
        else if(c>a && c>b)
        {System.out.println(c+" greater ");}

        System.out.println("Enter the number under 1-7\n");
        int d=s.nextInt();
        switch(d){
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("\nERROR");

        }
    }
}
