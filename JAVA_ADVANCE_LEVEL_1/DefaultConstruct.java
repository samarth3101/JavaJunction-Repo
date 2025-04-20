package JAVA_ADVANCE_LEVEL_1;

class Tata{
    String name;
    int price;

    Tata(){
        name = "Nexon";
        price = 18;
    }

    void displayInfo(){
        System.out.println("The name of the car is = " + name);
        System.out.println("The price of the car is = " + price);
    }
}

public class DefaultConstruct {
    public static void main(String[] args) {
        Tata car = new Tata();

        car.displayInfo();

    }
}
