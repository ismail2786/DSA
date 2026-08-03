import java.util.*;

// Arrays are list of items with same datatypes.
// code: type[] arrayName = new type[size];

public class Arrays {

    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 97; //phy
        // marks[1] = 98; //chem
        // marks[2] = 95; //eng

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // another method of defining and printing arrays
        // int marks[] = {97,98, 95};

        // for(int i=0; i<3; i++) {
        //     System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);

        // System.out.println("What is the size of array:");
        // int size = sc.nextInt();

        // int numbers[] = new int[size];

        // // input 
        // for(int i=0; i<size; i++) {
        //     System.out.println("Enter the values of position: " + i);
        //     numbers[i] = sc.nextInt();
        // }

        // // output
        // for(int i=0; i<size; i++) {
        //     System.out.println(numbers[i]);
        // }

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the size of array:");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for(int i=0; i<numbers.length; i++) {
            System.out.println("Enter the values of position: " + i);
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("X found at index: " + i);
            }
        }
    }
}


