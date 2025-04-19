package JAVA_BASICS_PROBLEMS;
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to get the table = ");
        int num = sc.nextInt();

        for (int i=1 ; i<=10 ; i++){
            System.out.println(num*i);
        }

        sc.close();
    }
}
