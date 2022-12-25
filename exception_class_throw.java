import java.util.*;

class YouAreNotAbleToVote extends Exception {
    @Override
    public String toString() { // return "you cannot give string input ";
        return super.toString() + "  you cannot give vote  ";

    }

    @Override
    public String getMessage() {
        return super.getMessage() + "you cannot give vote beacuse you are not 18 year old";
        // return " you cannot give string input \n you give only numerical input ";
    }
}

public class exception_class_throw {
    public static void main(String e[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the are for voting :");
        int a, b;
        a = s.nextInt();
        if (a < 18) {
            try {
                throw new YouAreNotAbleToVote();
            } catch (Exception z) {
                System.out.println(z);
                System.out.println(z.getMessage());
            }
        }
        else
        {System.out.println("you can give vote");}
        

    }
}
