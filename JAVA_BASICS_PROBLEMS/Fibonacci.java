package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range = ");
        int num = sc.nextInt();

        int first = 0 , second = 1;

        System.out.print("Fibonacci Series = ");

        for(int i = 1 ; i <= num ; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
