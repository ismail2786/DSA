public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation is the process of wrapping code and data together into a single unit.
        // In encapsulation, the variables or data of a class are hidden from other classes and can be accessed only through the methods of their current class.
        // Therefore, it is also known as data hiding.
        // Wrapping data and methods together in a single unit is called encapsulation.

        Student s1 = new Student();
        s1.setName("Ismail");
        s1.setAge(24);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}