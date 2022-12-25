package mypackage;
class hello{
    int add(int a,int b)
    {
        int c =a+b;
        return c;
    }
}
class java_hybried_language {
    public static void main(String[] args) {
        System.out.println("hello i am java and i am hybried language (compiler and interpriter) ");
        System.out.println(
                "first we oper new terminal and writer \n* javac java_hybried_language.java \n*java java_hybried_language \n\n ");
        /*
         * java is hybried language after compiled it make .class file and using javac
         * class file is convert onto byte code
         */
        hello s=new hello();
        //s.add(3, 4);
        System.out.println(s.add(3, 4));
    }

}