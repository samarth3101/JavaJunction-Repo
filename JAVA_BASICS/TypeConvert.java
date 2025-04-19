package JAVA_BASICS;

public class TypeConvert {
    public static void main(String[] args) {
        // We will see now how type conversion works along with type casting

        // Type conversion
        int x = 10;
        float y = x;

        double a = 98.899;
        int b = (int)a;

        System.out.println("Conversion (10 to 10.0) = " + y);

        System.out.println("Casting (98.899 to 98) = " + b);
    }
}
