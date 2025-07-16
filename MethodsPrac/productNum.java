package MethodsPrac;

import java.util.Scanner;

public class productNum {

    public static int multiply(int num1, int num2){
        int pro = num1 * num2;
        return pro;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num : ");
        int a = sc.nextInt();

        System.out.print("Enter second num : ");
        int b = sc.nextInt();

        int result = multiply(a, b);

        System.out.println(result);

        sc.close();
    }
}
