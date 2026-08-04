import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // string declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";

        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);

        // String functions
        // Concatenation
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName  + " " + lastName;

        // System.out.println(fullName);

        // Length()
        // System.out.println(fullName.length());

        // charAt
        // for(int i=0; i<fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // compareTo()
        // compare function checks
        // 1. s1 > s2  : return +ve value
        // 2. s1 == s2 : return 0
        // 3. s1< s2   : return -ve value
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Equal");
        // }else {
        //     System.out.println("Not equal");
        // }

        // why we are not == because it fails in some cases for example
        // here strings are saved in object and in above example its stored in variable.
        // if( new String("Tony") == new String("Tony")) {
        //     System.out.println("Equal");
        // }else {
        //     System.out.println("Not equal");
        // }

        // substring()
        // String sentence = "My name is Tony Stark";
        // substring(start index, end index(bydefault));
        // String name = sentence.substring(11, 15);
        // String name = sentence.substring(11, sentence.length());
        // String name = sentence.substring(16);
        // System.out.println(name);

        // String hero = "TonyStark";
        // String name = hero.substring(0,4);
        // String name = hero.substring(4);
        // System.out.println(name);

        // Strings are Immutable
        // StringBuilder

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // charAt(0)
        // System.out.println(sb.charAt(0));

        // set charater at index with setCharAt().
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

        // insert()
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // achive this "Tonny"
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // .delete()
        // sb.delete(2, 4);
        // System.out.println(sb);

        // append() adding char at the end.
        // no change in memory by this method.
        // String create new string while append() adding string to the same string. less time and more efficient code.
        // StringBuilder sb = new StringBuilder("h");
        // sb.append('e'); // str = str + "e";
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');
        // System.out.println(sb);
        
        // // .length()
        // System.out.println(sb.length());

        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() -1 -i; // 5-4-0 = 4; last one

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
}