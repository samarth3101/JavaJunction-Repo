package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range");
        int num = sc.nextInt();

        int sum= 0;

        for (int i = 1 ; i <= num ; i++){
            sum += i;
        }

        System.out.println("The sum of n natural number is = " + sum);

        sc.close();
    }
}
