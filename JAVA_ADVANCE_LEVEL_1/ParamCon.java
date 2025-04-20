package JAVA_ADVANCE_LEVEL_1;

class Bike{
    String name;
    int price;

    Bike(String b , int c){
        name = b;
        price = c;
    }

    void displayInfo(){
        System.out.println("The name of this bike is : " + name);
        System.out.println("The price of this bike is : " + price + " K");
    }
}

public class ParamCon {
    public static void main(String[] args) {
        Bike b1 = new Bike("Kawasaki Z900", 900);

        b1.displayInfo();
    }
}
