package JAVA_ADVANCE_LEVEL_1;

class Car{
    String name;
    int price;

    void displayInfo(){
        System.out.println("The name of this beast is : " + name);
        System.out.println("The price of this machine is : " + price + " Cr.");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car C1 = new Car();

        C1.name = "LR Range Rover sport";
        C1.price = 2;

        C1.displayInfo();
    }
}
