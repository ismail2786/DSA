import java.util.*;

public class Exercise1 {
    // 1. Enter 3 numbers from the user & make a function to print their average.
    // public static void average(int a, int b, int c) {
    //     int avrg = (a + b + c) / 3;
    //     System.out.print(avrg);
    //     return;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     average(a,b,c);
    // }   

    // 2.Write a function to print the sum of all odd numbers from 1 to n.
    // public static void printOdd(int n) {
    //     for(int i=1; i<=n; i++) {
    //         if((i % 2) != 0) {
    //             System.out.println(i);
    //         }
    //     }
    //     return;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     printOdd(n);
    // }

    //3. Write a function which takes in 2 numbers and returns the greater of those two.
    // public static int returnGreaterNumber(int a, int b) {
    //     if(a > b) {
    //         return a;
    //     }else {
    //         return b;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.print(returnGreaterNumber(a,b));
        
    // }

    //4. Write a function that takes in the radius as input and returns the circumference of a circle.
    // public static double circumferenceOfCircle(double r) {
    //     double c = 2 * Math.PI * r;

    //     return c;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     double r = sc.nextDouble();

    //     System.out.println(circumferenceOfCircle(r));
    // }

    // 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

    // public static String isVoter(int age) {
    //     if(age >= 18) {
    //         return "You are eligible for vote";
    //     }else {
    //         return "You are not eligible for vote";
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int age = sc.nextInt();

    //     System.out.print(isVoter(age));
    // }

    // 6. Write an infinite loop using do while condition.
    // public static void main(String[] args) {
    //     // int i=0;
    //     // do {
    //     //     System.out.println(i++);
    //     // }while (true);
    //     // do {
    //     //     System.out.println("Hello");
    //     // } while (1 == 1);
    // }

    // 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

    // public static void userNumbers() {
    //     Scanner sc = new Scanner(System.in);

    //     int countPositive = 0;
    //     int countNegative = 0;
    //     int countZeros = 0;

    //     // int num; 
    //     do {
    //         System.out.println("Eneter a number: ");
    //         int num = sc.nextInt();

    //         if(num > 0) {
    //             countPositive++;
    //         }else if(num < 0) {
    //             countNegative++;
    //         }else {
    //             countZeros++;
    //         }

    //         // process the number here
    //         System.out.print("Do you want to enter another number? ?(1 = Yes, 0 = No): ");
    //         int choice = sc.nextInt();

    //         System.out.println("Positive count " + countPositive);
    //         System.out.println("Negative count " + countNegative);
    //         System.out.println("Zeros count " + countZeros);

    //         if(choice == 0) {
    //             break;
    //         }
    //     }while(true);

    // }

    // public static void main(String[] args) {
    //     userNumbers();
    // }

    // 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    
    // public static void power() {
    //     Scanner sc = new Scanner(System.in);

    //     int x = sc.nextInt(); // base
    //     int n = sc.nextInt(); // power
    //     int number = 1;

    //     for(int i=1; i<=n; i++) {
    //         number = number * x;
    //     }
    //     System.out.print(number);
    // }

    // public static void main(String[] args) {
    //     power();
    // }

    // 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

    // public static void calculateGreatestCommonDivisor() {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     for(int i=1; i<=a; i++) {
    //         if((a % i) == 0 ) {
    //             // System.out.println(i);
    //         }
    //     }

    //     System.out.println("-------");
        
    //     for(int i=1; i<=b; i++) {
    //         if((b % i) == 0 ) {
    //             // System.out.println(i);
    //         }
    //     }

    //     System.out.println("-------");

    //     int limit = Math.min(a,b);
    //     int gcd = 1;
    //     for(int i=1; i<=limit; i++) {
    //         if( a % i == 0 && b % i == 0) {
    //             gcd = i;
    //         }
    //     }
    //     System.out.println("GCD: " + gcd);

    //     return;
    // }

    // public static void main(String[] args) {
    //     calculateGreatestCommonDivisor();
    // }

    // 10. Write a program to print Fibonacci series of n terms where n is input by user :
    // 0 1 1 2 3 5 8 13 21 ..... 
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

    public static void fibonacciSeries() {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter a postive number.");
        }

        int first=0;
        int second=1;

        System.out.println("Fibonacci Series of " + n + " terms:");

        for(int i=1; i<=n; i++) {
            System.out.print(first + " ");

            // calculate next number in sequence.
            int next = first + second;

            // shift the value from 1st to 2nd
            first = second;
            second = next;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        fibonacciSeries();
    }


} 