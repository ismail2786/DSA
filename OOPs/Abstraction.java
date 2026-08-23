// abstract class Animal {
//     abstract void walk(); // Abstract = Blueprint not actual animal.
// }

// class Horse extends Animal {
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }

// Interfaces
// we only defining the function in interfacs.
interface Animal {
    public void walk();
}

// use implement for interface not extends
class Horse implements Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
} 



public class Abstraction {
    public static void main(String[] args) {
        // Abstraction is the process of hiding the implementation details and showing only functionality to the user.
        // In other words, it shows only essential things to the user and hides the internal details, i.e., it hides the complexity from the user.
        // Abstraction can be achieved with either abstract classes or interfaces (in Java).
        // Abstract class is a class that is declared with the abstract keyword.
        // Hiding complex data to the user and showing only the necessary parts of the data is called abstraction.

        Horse horse = new Horse();
        horse.walk();
    }
}