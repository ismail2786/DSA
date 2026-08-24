// Poly = many | morphs = forms | we can write different functions with same name is called polymorphism.
// there are two types
// function overloading = complie time polymorphism (if two function with same arguments it will throw an error)
// function overriding = run time polymorphism

// same name function within same class is called function overloading.


public class Polymorphism {

    static class Student {
        String name;
        int age;

        public void printInfo(String name) {
            System.out.println(this.name);
        }

        public void printInfo(int age) {
            System.out.println(this.age);
        }

        public void printInfo(String name, int age) {
            System.out.println(this.name + " " + this.age);
        } 
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ismail";
        s1.age = 24;

        s1.printInfo(s1.name, s1.age);
    }
}