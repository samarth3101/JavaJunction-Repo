package JAVA_ADVANCE_LEVEL_1;


class Add{
    int a;
    int b;

    void add(int a, int b){
        int sum = a+b;
        System.out.println("The addition of two number is = " + sum);
    }

}

public class MethodParam {
    public static void main(String[] args) {
        Add ad = new Add();

        ad.add(10,15);
    }
    
}
