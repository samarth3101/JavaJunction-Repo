package MethodsPrac;
import java.util.*;

public class sum {

    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of two is : " + sum);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        calculateSum(a, b);

        sc.close();
    }
}
