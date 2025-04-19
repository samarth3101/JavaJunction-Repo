package JAVA_BASICS;

public class loops {
    public static void main(String[] args) {
        // Here we will see how loop works

        // we have mainly 4 types of loops
        //  1. for loop
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("for loop executed..!");
        }

        //  2. while loop
        int z = 1;
        while (z <= 5){
            System.out.println("Z = " + z);
            z++;
        }


        //  3. do-while loop
        int j = 1;
        do{
            System.out.println("j = " + j);
            j++;
        } while (j <=5);


        //  4. for-each loop 
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int num : numbers){
            System.out.println("We have this list = " + num);
        }
    }
}
