package JAVA_BASICS;

class Student{
    String name;

    static String schoolName = "PCET's PCU";

    Student(String studentName){
        name = studentName;
    }

    void displayInfo(){
        int marks = 95;

        System.out.println("Name: " + name);
        System.out.println("School name: " + schoolName);
        System.out.println("Marks Obtained : " + marks);
    }
}
    

public class VariableTypes {
    public static void main(String[] args) {
        Student s1 = new Student("Samarth");
        Student s2 = new Student("Manav");

        s1.displayInfo();
        s2.displayInfo();
    }
}
