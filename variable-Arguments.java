//# java-programming-language

public class variable_argument {
    static int sum(int ...array) //its veriabl argument (varargs)
    {
        int sum=0;
        for(int element:array)
        {
            sum += element;
        }
        return sum;
    }
 public static void main(String[] args) {
    System.out.println("sum is 2,4:  "+sum(2,4));
    System.out.println("sum is 4,9,3   "+sum(4,9,3));
    System.out.println("sum is 2,4,6,7  "+sum(2,4,6,7));


 }   
}
