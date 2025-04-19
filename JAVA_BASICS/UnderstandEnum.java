package JAVA_BASICS;

// enum holds fixed value 

enum color{
    RED, GREEN, BLUE;
}

public class UnderstandEnum {
    public static void main(String[] args) {
        color FavColor = color.BLUE;
        // if i write color.WHITE which is not included here it will throw an error

        System.out.println("My Favourite colour is = " + FavColor);
        // this means we can only use those values which are fixed in enum class. 
        // similar to class but with different functionalities.
    }
}
