package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word to count vowels");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
                count++;
            }
        }

        System.out.println("The number of vowels are = " + count);

        sc.close();
    }
}
