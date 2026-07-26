
import java.util.*;

public class Input {
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);

        // String name = sc.next(); // for single word.
        // String name = sc.nextLine(); // for complete sentence.

        // nextInt(); for Integer
        // nextFloat(); for float
        // nextDouble(); for double
        // nextLong();  for long

        // System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a+b;

        System.out.print(c);
    }   
}