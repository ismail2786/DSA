import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if(age % 2 == 0) {
        //     System.out.println("Even");
        // }else {
        //     System.out.println("Odd");
        // }

        // if(age >= 60) {
        //     System.out.println("You are a senior citizen");
        // }
        // else if(age >= 18) {
        //     System.out.println("You are an adult");
        // }
        // else {
        //     System.out.println("yoy are a child");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b) {
        //     System.out.println("a is equal to b");
        // }else if( a > b) {
        //     System.out.println("a is greater than b");
        // }else {
        //     System.out.println("a is lesser than b");
        // }

        // int button = sc.nextInt();

        // if(button == 1) {
        //     System.out.println("1 pressed");
        // }else if (button == 2) {
        //     System.out.println("2 pressed");
        // }else if(button == 3) {
        //     System.out.println("3 pressed");
        // }else {
        //     System.out.println("Inavlid " + button);
        // }

        int number = sc.nextInt();

        switch(number) {
            case 1: {
                System.out.println("1");
            }
            break;
            case 2: {
                System.out.println("2");
            }
            break;
            case 3: {
                System.out.println("3");
            }
            break;
            case 4: {
                System.out.println("4");
            }
            break;
            case 5: {
                System.out.println("5");
            }
            default: {
                System.out.println("invalid");
            }            
        }
    }
}