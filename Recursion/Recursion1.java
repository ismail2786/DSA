public class Recursion1 {

    // print number from 5 to 1
    // public static void printNumber(int num) {
    //     // if(num == 0) { BASE
    //     //     return;
    //     // }
    //     if(num > 0) {
    //         System.out.println(num);
    //         printNumber(num-1); // recursion
    //     }
    // }

    // public static void main(String[] args) {
    //     printNumber(5);
    // }

    // print numbers from 1 to 5
    // public static void printNumber(int num) {
    //     if(num < 6) {
    //         System.out.println(num);
    //         printNumber(num+1);
    //     }
    // }

    // Q. print sum of first n natural numbers
    // public static void printSum(int i, int n, int sum) {
    //     if(i == n){
    //         sum +=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum +=i;
    //     printSum(i+1, n, sum);
    //     System.out.println(i);
    // }

    // Q. Print Factorial of a number n.
    // 3! = 3*2*1; // (n-1)!
    // public static int printFactorial(int n) {
    //     if(n == 1 || n == 0) {
    //         return 1;
    //     }
    //     int fact_nm1 = printFactorial(n-1);
    //     int fact_n = n * fact_nm1;

    //     return fact_n;
    // }

    // public static void main(String[] args) {
    //     // A function that call itself is called recursion.
    //     // f(f(x))
    //     // outer function = steps
    //     // inner function = rest of work

    //     // int num = 1;
    //     // printNumber(num);

    //     // int n in recursion every time create new space in stack memory so if we use infinite recursion
    //     // memory will overflow it is called stack overflow

    //     // printSum(1, 5, 0);
    //     int n = 5;
    //     int ans = printFactorial(n);
    //     System.out.println(ans);

    // }


    //Q: Print the Fibonacci sequence till nth term
    // a b c where c=a+b;
    // sum of previous two terms is fib series.
    // public static void printFibonacci(int a, int b, int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     printFibonacci(b, c, n-1);
    // }

    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFibonacci(a, b, n-2);
    // }


    // Q: Print n^2 (stack height = n)
    // public static int calcPower(int x, int n) {
    //     if(n == 0){ // base case 1
    //         return 1;
    //     }

    //     if(x == 0) { // base case 2
    //         return 0;
    //     }

    //     int xPownm1 = calcPower(x, n-1); // kam
    //     int xPown = x * xPownm1;

    //     return xPown;
    // } 

    // public static void main(String[] args) {
    //     int x=2;
    //     int n=5;
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
    // }

    // Q: Print x^n (stack height = logn)
    // public static int calcPower(int x, int n) {
    //     if(n == 0) { // base case 1
    //         return 1;
    //     }
    //     if(x == 0) { // base case 2
    //         return 0;
    //     }

    //     // if n is even
    //     if(n % 2 == 0) {
    //         return calcPower(x, n/2) * calcPower(x, n/2);
    //     }else { // if n is odd
    //         return calcPower(x, n/2) * calcPower(x, n/2) * x;
    //     }
    // }

    // public static void main(String[] args) {
    //     int x = 2;
    //     int n = 5;
        
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
    // }
}