package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class CheckNumPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        String num = sc.nextLine();

        String reverse = "";

        for(int i = num.length() - 1 ; i >=0 ; i--){
            reverse += num.charAt(i);
        }

        if(num.equals(reverse)){
            System.out.println("THe number is Palindrom.");
        } else{
            System.out.println("The number is not Palindrom.");
        }

        sc.close();
    }
}
