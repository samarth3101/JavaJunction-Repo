package JAVA_ADVANCE_LEVEL_1;

class Bike {
    String model;

    Bike(String model) {
        this.model = model;  // ✅ Now Java knows you're assigning parameter to the instance variable
    }

    void display() {
        System.out.println("Model: " + model);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Bike b = new Bike("KTM Duke 390");
        b.display();
    }
}
