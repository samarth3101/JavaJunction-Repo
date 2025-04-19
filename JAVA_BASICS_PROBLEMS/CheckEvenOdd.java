package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check = ");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("the number is even");
        } else{
            System.out.println("the number is odd");
        }

        sc.close();
    }
}
