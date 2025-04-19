package JAVA_BASICS;
import java.util.*;
// here we will discuss about conditioanl statements

public class Conditional {
    // we have mainly 4 types
    /// 1. If statement
    /// 2. If-Else statement
    /// 3. If-Else-if statement
    /// 4. switch statement
    public static void main(String[] args) {
        // If statement
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age = ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You can have driving license");
        } //here if we enter less than 18 nothing will print to overcomwe this flaw we have else statement

        // If-Else
        System.out.print("Enter your budget in lakhs for car = ");
        int price = sc.nextInt();

        if(price>5){
            System.out.println("You can buy premium cars");
        } else{
            System.out.println("Sorry.! your are on low budget");
        }

        // we also have if-else ladder for multiple condition to get the exact result in the range

        System.out.print("Enter the range of the gun in meters = ");
        int range = sc.nextInt();

        if(range > 1000){
            System.out.println("The range is excellent");
        } else if(range <100 && range >800){
            System.out.println("The range is somewhat good.");
        } else if(range<800 && range > 400){
            System.out.println("Range is very low.");
        } else{
            System.out.println("Toy guns are not included in the deal.");
        }

        // switch statment if not this then next it swithes
        // note here to use break after every switch so that it will stop exe
        System.out.print("Enter the number to get reward associated with that number (1-5) = ");
        int num = sc.nextInt();

        switch (num){
            case 1:
            System.out.println("You won 1 Lakh cash...!");
            break;

            case 2:
            System.out.println("You won a brand new BMW M5 CS....!");
            break;

            case 3:
            System.out.println("You won a PS5 limited edition...!");
            break;

            case 4:
            System.out.println("You won a 50000 worth voucher....!");
            break;

            case 5:
            System.out.println("Better luck..! try next time...");
        }

        sc.close();
    }
}
