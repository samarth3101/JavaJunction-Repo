package MethodsPrac;

public class binoCoeff {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    public static int binCoef(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);

        int fact_nr = factorial(n-r);

        int bino = fact_n / (fact_r * fact_nr);
        return bino;
    }

    public static void main(String[] args) {
        int pro = binCoef(5, 2);

        System.out.println(pro);
    }
}
