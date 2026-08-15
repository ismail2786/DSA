// Interfaces
// we only defining the function in interfacs.

interface Animal {
    int eye = 2; // fieds are public, static and final bydefault.
    public void walk();
}

interface Herbivore {

}

// multiple inheritance
class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

// static 
class Student {
    String name;
    static String school; // scholl will be same for all students because its static. (school is common for all students)
}

public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        Student.school = "JMV"; // we can access variables with static keyword becuase it is belongs to class not object.
        Student student1 = new Student();
        student1.name = "Tony";

        System.out.println(student1.school);
    }
}

// static occupy memory only once while object occupies everytime. 
// so using staic for same info reduce memory
