package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check + - or 0 = ");

        int x = sc.nextInt();

        if(x>0){
            System.out.println("The number is positive.");
        } else if(x<0){
            System.out.println("The number is negative");
        } else{
            System.out.println("The number is zero");
        }

        sc.close();
    }
}
