import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        // Bit Manipulation methods
        // Get - fetch bit
        // Set - set 0 to 1 or 1 to 0
        // Clear - change bit to 0
        // Update - change bit 1 to 0 or 0 to 1

        // Get Bit
        // Get the 3rd bit (position 2) of a number n. (n=0101)
        // Step 1 = Bit Mask: 1<<1
        // Step 2 = AND Operation

        // Get Bit
        // int n = 5; // 0101
        // int pos = 3;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0) {
        //     System.out.println("Bit was zero");
        // }else {
        //     System.out.println("Bit was one");
        // }

        // Set Bit
        // Bit Mask: 1<<i
        // Operation: OR
        // Set the 2nd bit (position 1) of a number n. (n=0101)
        //  int n = 5; // 0101
        //  int pos = 1;
        //  int bitMask = 1<<pos;

        //  int newNumber = bitMask | n;
        //  System.out.println(newNumber);

        // Clear Bit
        // Bit Mask: 1<<i
        // Operation: AND with NOT
        // Clear the 3rd bit (position 2) of a number n. (n=0101)
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Update Bit 
        // update the 2nd bit (position = 1) of a number n to 1. (n=0101)

        // for 0
        // Bit Mask: 1<<1;                         
        // Operation: AND with NOT

        // for 1
        // Bit Mask: 1<<1;
        // Operation: OR

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : SET 
        // oper=0 : CLEAR

        int n = 5; // 0101 => 0111 => dec 7
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper == 1) {
            // for 1 (SET Operation)
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else {
            // for 0 (CLEAR Operation)
            int notBitMask = ~(bitMask);

            int newNumber = notBitMask & n;
            System.out.println(newNumber); 
        }








    }
}