public class Patterns {

    // Solid Rectangle
    // public static void main(String[] args) {
    //     for(int i=1; i<=4; i++) {
    //         for(int j=1; j<=5; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println("test");
    //     }
    // }

    // Hollow Rectangle
    // public static void main(String[] args) {

    //     int n = 4;
    //     int m = 5;

    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=m; j++) {
    //             if(i == 1 || j == 1 || i == n || j == m) {
    //                 System.out.print("*");
    //             }else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }        
    // }

    // Half Pyramid
    // public static void main(String[] args) {

    //     for(int i=1; i<=4; i++) {
    //         System.out.println();
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //     }
    // }

    // Inverted Half Pyramid
    // public static void main(String[] args) {

    //     for(int i=4; i>=1; i--) {
    //         System.out.println();
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //     }
    // }

    // Inverted Half Pyramid rotated 180 deg
    // public static void main(String[] args) {
    //     int n = 4;
    //     // outer loop
    //     for(int i=1; i<=n; i++) {
    //         // inner loop -> space print
    //         for(int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // inner loop -> star print
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Half pyramid with Number
    // public static void main(String[] args) {
    //     for(int i=1; i<=5; i++) {
    //         System.out.println();
    //         // print number
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(j + " ");
    //         }
    //     }
    // }

    // Half pyramid with Number Inverted
    // public static void main(String[] args) {
    //     for(int i=5; i>=1; i--) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    //     // another method
    //     System.out.println("Another Method");
    //     int n = 5;
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=n-i+1; j++) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }


    // Floyd's Triangle 
    // public static void main(String[] args) {
    //     int n = 5;
    //     int number = 1;

    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(number + " ");
    //             number = number + 1;
    //         }
    //         System.out.println();
    //     }
    // }

    // 0-1 Triangle
    // public static void main(String[] args) {
    //     for(int i=1; i<=5; i++) {
    //         for(int j=1; j<=i; j++) {
    //             if ((i+j) % 2 == 0) {
    //                 System.out.print("1");
    //             }else {
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     for(int i=0; i<=5; i++) {
    //         for(int j=1; j<=i; j++) {
    //             if((i+j) % 2 == 0) {
    //                 System.out.print("1");
    //             }else {
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // Probles have to solve 
    // https://docs.google.com/document/d/1OrUsnDqzma9ob467aCdvRlZwkK7mhl552n92vlBXr_U/edit?pli=1&tab=t.0

    // public static void main(String[] args) {
    //     int n =5;
    //     // upper half
    //     for(int i=1; i<=n; i++) {
    //         // 1st part
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }

    //         // spaces
    //         int space = 2 * (n-i);
    //         for(int j=1; j<= space; j++) {
    //             System.out.print(" ");
    //         }

    //         // 2nd part
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    //     // lower half
    //         for(int i=n; i>=1; i--) {
    //         // 1st part
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }

    //         // spaces
    //         int space = 2 * (n-i);
    //         for(int j=1; j<= space; j++) {
    //             System.out.print(" ");
    //         }

    //         // 2nd part
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }
    // }

    // Print Solid Rhombus
    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=n; i>=1; i--) {
    //         // space
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1; j<=n; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Number Pyramid
    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=1; i<=n; i++) {
    //         // space
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         // numbers
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // Palindromic Pattern
    // public static void main(String[] args) {
    //     int n =5;
    //     for(int i=1; i<=n; i++) {
    //         // space
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         // 1st side
    //         for(int j=i; j>=1; j--) {
    //             System.out.print(j);
    //         }
    //         // 2nd side
    //         for(int j=2; j<=i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    // Diamond Pattern
    // public static void main(String[] args) {
    //     int n=4;
    //     for(int i=n; i>=1; i--) {
    //         //spaces
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(" ");
    //         }

    //         //  1st stars
    //         for(int j=i; j<=n; j++) {
    //             System.out.print("*");
    //         }

    //         // 2nd stars
    //         for(int j=i+1; j<=n; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    //     for(int i=2; i<=n; i++) {
    //         //spaces
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(" ");
    //         }

    //         //  1st stars
    //         for(int j=i; j<=n; j++) {
    //             System.out.print("*");
    //         }

    //         // 2nd stars
    //         for(int j=i+1; j<=n; j++) {
    //             System.out.print("*");
    //         }
            
    //         System.out.println();
    //     }
    // }

    // Diamond Pyramid another method
    // public static void main(String[] args) {
    //     int n=4;
    //     // upper part
    //     for(int i=1; i<=n; i++) {
    //         // space
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }

    //         // stars
    //         for(int j=1; j<=2*i-1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     // lower part
    //     for(int i=n; i>=1; i--) {
    //         // space
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }

    //         // stars
    //         for(int j=1; j<=2*i-1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


}