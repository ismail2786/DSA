import java.util.*;

public class Functions {

    // public static void printMyName(String name) {
    //     System.out.println(name);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name); // function call
    // }

    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a,b);
    //     System.out.println("Sum of two numbers is = " + sum);
    // }

    // public static int calculateProduct(int a, int b) {
    //     int product = a * b;
    //     return product;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int product = calculateProduct(a,b);

    //     System.out.println("Product of two numbers is = " + product);
    // }

    public static void printFactorial(int n) {

        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
            System.out.print(factorial);
            return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
}