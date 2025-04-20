package JAVA_ADVANCE_LEVEL_1;

class AccessControlExample{
    public int num = 5;
    static int num1 = 10;
    int num2 = 15;
    private int num3 = 20;

    void displayField(){
        System.out.println("PUBLIC INT = " + num);
        System.out.println("STATIC NUM = " + num1);
        System.out.println("DEFAULT NUM = " + num2);
        System.out.println("PRIVATE NUM = " + num3);
    }
}

public class AccessControl {
    public static void main(String[] args) {
        AccessControlExample AS = new AccessControlExample();

        AS.displayField();
    }
}
