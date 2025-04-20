package JAVA_ADVANCE_LEVEL_1;

class TataCar{
    String name;
    String model;
    String color;
    int price;
    int year;

    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price + "Lakhs.");
        System.out.println("Year : " + year);
    }
}

public class Tata {
    public static void main(String[] args) {
        TataCar car1 = new TataCar();
        TataCar car2 = new TataCar();

        car1.name = "Harrier";
        car1.model = "XZ+ (O)";
        car1.color = "White";
        car1.price = 35;
        car1.year = 2025;

        car2.name = "Nexon";
        car2.model = "XZ+ (P)";
        car2.color = "Black";
        car2.price = 18;
        car2.year = 2024;

        car1.displayInfo();
        System.out.println("------------------------------------");
        car2.displayInfo();
    }
}
