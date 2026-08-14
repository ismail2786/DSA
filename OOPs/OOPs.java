// Types of constructor
// 1. non-paramatrize (taking no arguments)
// 2. paramatrize (taking arguments)
// 3. Copy Constructor (copy cons from one object to another)

// we are not using Destructor to destroy the object garbage collection automatically deletes unused objects.




class Pen {
    String color;
    String type; // gel / ball

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String name, Int age) {
    //     System.out.println("Constructor called.");
    // }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }

}

public class OOPs {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ball";

        // pen1.printColor();
        // pen2.printColor();

        // Student is a constructor which is used to create object of class Student
        // new keyword is used to create object of class Student
        // class name and object name should be same.
        // constructor is not returning any value.
        Student s1 = new Student();
        s1.name = "Ismail";
        s1.age = 24;

        Student s2 = new Student(s1);   

        s2.printInfo();
    }
}