import java.util.*;

public class TwoDArrays {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the numbers of rows");
    //     int rows = sc.nextInt();
    //     System.out.println("Enter the numbers of cols");
    //     int cols = sc.nextInt();

    //     int [][] numbers = new int[rows][cols];

    //     //input 
    //     // rows
    //     for(int i=0; i<rows; i++) {

    //         // cols
    //         for(int j=0; j<cols; j++) {
    //             System.out.print("Enter the valus of [i][j]");
    //             System.out.print(i);
    //             System.out.print(j);
    //             System.out.println();
    //             numbers[i][j] = sc.nextInt();
    //         }
    //     }

    //     //output
    //     for(int i=0; i<rows; i++) {

    //         for(int j=0; j<cols; j++) {
    //             System.out.print(numbers[i][j] + " ");
    //         }

    //         System.out.println();
    //     }
    // }

    // take a matrix input from user and search for a given number x and print the indices at which it occurs.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols]; 

        //input
        //rows
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print("Enter the valus of: ");
                System.out.print("[" + i + "]");
                System.out.print("[" + j + "]");
                System.out.println();
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the of x");
        int x = sc.nextInt();

        //output 
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {

                if(matrix[i][j] == x) {
                    System.out.print("x found at indices:" + "(" + i + "," + j + ")");
                }
            }
        }
    }
}