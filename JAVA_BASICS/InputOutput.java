package JAVA_BASICS;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("IN THIS PROGRAMM YOU WILL FIND HOW TO TAKE INPUTS AND OUTPUT AND USE CASE OF METHOD :) :)");
        
        // nextLine()
        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        // nextint()
        System.out.print("Enter your age = ");
        int age = sc.nextInt();

        //nextFloat()
        System.out.print("Enter the value of pie you remember = ");
        float pie = sc.nextFloat();

        // nextDouble
        System.out.print("Enter as much decimal you want");
        double db = sc.nextDouble();

        // nextBoolean
        System.out.print("Choose either True or False = ");
        boolean tf = sc.nextBoolean();

    
        System.out.println("THIS WAS YOUR SELECTION\n");

        System.out.println("Your name is = " + name);
        System.out.println("Your age is = " + age);
        System.out.println("THe pie value you entered is = " + pie);
        System.out.println("You entered this much decimal number = " + db);
        System.out.println("Your choice for T/F is = " + tf);
        sc.close();
    }
}
