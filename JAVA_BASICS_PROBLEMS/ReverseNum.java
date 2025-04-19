package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        String num = sc.nextLine();

        String reverse = "";

        for(int i = num.length() - 1 ; i >=0 ; i--){
            reverse += num.charAt(i);
        }


        System.out.println("Reverse number are = " + reverse);

        sc.close();
    }
}
