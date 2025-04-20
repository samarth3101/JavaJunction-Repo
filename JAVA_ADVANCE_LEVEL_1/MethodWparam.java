package JAVA_ADVANCE_LEVEL_1;

class Sound{
    void sound(){
        System.out.println("Dog barks..!");
    }
}

public class MethodWparam {
    public static void main(String[] args) {
        Sound sd = new Sound();
        sd.sound();
    }
}
