//# java-programming-language

public class string {
    public static void main(String[] ag)
    {
        /*declaration */
        String name ="krishna";
        String data ="Krishna";
        /*char data[] = {'k','r','i','s','h','n'};
        String he = new String(data);*/
        System.out.println(name+"\n");
        //System.out.println(he);

        //String methods

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        name=name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name.trim());
        name= name.trim();
        System.out.println(name.substring(3,5));
        System.out.println(name.replace('h','a'));
        System.out.println(name.startsWith("kr"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf('n'));
        System.out.println(name.equals(data));//its methods is case sensitive
        System.out.println(name.equalsIgnoreCase(data));
        System.out.println("\\");
    }
}
 
