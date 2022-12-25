//# java-programming-language

// factorial of number
public class recurtion {
    static int factorial(int n)
    {
        if(n==0 || n==1)
        return 1;
        return ( n*  factorial(n-1));
    }
    public static void main(String[] args) {
        int a=3;
        System.out.println(factorial(a));
    }
}
