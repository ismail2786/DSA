import java.util.Scanner;

public class Loops {
    // for loop
    // public static void main(String[] agrs) {
    //     System.out.println("Loops");

    //     for(int i=0; i<=100; i++) {
    //         System.out.println("Hello World " + i);
    //     }
    // }

    // while loop
    // public static void main(String[] args) {
    //     int i = 0;

    //     while(i < 11) {
    //         System.out.println(i++);
    //     }
    // }

    // do while loop | must run one time even condition false.
    // public static void main(String[] args) {
    //     int i = 0;
    //     do {
    //         System.out.println(i++);
    //     }while(i < 11);
    // }

    // find the sum of first four natural numbers.

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int sum = 0;

    //     for(int i=0; i<=n; i++) {
    //         sum = sum + i;
    //     }

    //     System.out.println(sum);
    // }

    // print the table of number input by user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            
            System.out.println(i*n);
        }
    }
}