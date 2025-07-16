package MethodsPrac;

public class FindFactorial {
    
    public static int factorial(int n){
        int f = 1;

        for (int i = 1 ; i <= n ; i++){
            f = f * i;
        }

        return f;
    }
    
    public static void main(String[] args) {
        int a = 5;
        int res = factorial(a);

        System.out.println(res);
    }
}
