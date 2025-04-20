package JAVA_ADVANCE_LEVEL_1;

class Laptop{
    String name;
    int price;

    Laptop(){
        name = "MacBook M4 Pro";
        price = 210;
    }

    Laptop(String s , int i){
        name = s;
        price = i;
    }

    void displayInfo(){
        System.out.println("The name of the Laptop is : " + name);
        System.out.println("THe price is : " + price + " K");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();                           // Default constructor
        Laptop l2 = new Laptop("MacBook M2 Pro", 145);      // Parameterized constructor

        l1.displayInfo();
        System.out.println("---------------------------------------------");
        l2.displayInfo();
    }
}
