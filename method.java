//# java-programming-language


public class method {
    static void change()
    {
        System.out.println("hello krishna ");
    }
    static int change(int a,int b)
    {
        System.out.println(a+b);
        return 0;
    }
    static void change(int arr[])
    {
        arr[0]=20;
    }
    public static void main(String[] args) {
        int [] hello={2,5,6,7,8,11,25,77,80};
        change();
        change(hello);
        for(int i=0;i<hello.length;i++)
        {
            System.out.print(hello[i]+" ");
        }
        System.out.println();
        change(4,5);

    }
}
