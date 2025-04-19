package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to get factorial = ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }

        System.out.println("The factorial " + num + " is " + fact);

        sc.close();
    }
}


