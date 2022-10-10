import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("please Enter your grade");
            double e = in.nextDouble();
            cc c = new cc(e);
            System.out.println(c.letterGrade());
        }catch (Exception ex){
            System.out.println("Please enter number not charter");

        }
    }

}