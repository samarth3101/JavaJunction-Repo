package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word = ");
        String str = sc.nextLine();

        String original = str.toLowerCase();
        String reverse = "";

        for (int i = original.length() - 1 ; i>=0 ; i--){
            reverse += original.charAt(i);
        }

        if(original.equals(reverse)){
            System.out.println("it is a palindrom.");
        } else{
            System.out.println("it is not a palindrom.");
        }

        sc.close();
    }
}

