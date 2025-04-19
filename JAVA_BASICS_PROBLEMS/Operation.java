package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        int pro = num1 * num2;
        int diff = num1 - num2;
        int div = num1 / num2;

        System.out.println("Product is = " + pro);
        System.out.println("Difference is = " + diff);
        System.out.println("Division is = " + div);

        sc.close();
    }
}
