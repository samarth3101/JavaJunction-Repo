package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number = ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("First number is largest.");
        } else if(num2>num1 && num2>num3){
            System.out.println("Second number is largest");
        } else if (num1==num2 || num2 ==num3){
            System.out.println("Numbers are same.(num1 and num2 or num2 and num3)");
        } else if(num1==num3){
            System.out.println("Numbers are same (num1 and num3)");
        } else{
            System.out.println("Third number is largest");
        }

        sc.close();
    }
    
}
