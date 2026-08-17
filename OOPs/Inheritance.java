// One class inherites property or methods of another class called inheritance.
// Triangle inherits Shape class
// due to inheritance, we can access the properties of Shape class in Triangle class
// it reduces the code duplication and increases the reusability of code.
// Shape is a parent class and Triangle is a child class.
// Derived class can access the properties and methods of base class.
// There are 4 types of inheritance
// 1. Single Level Inheritance
// 2. Multi Level Inheritance
// 3. Hierarchial Inheritance
// 4. Hybrid Inheritance


// Single Level Inheritance
class Shape {
    String color;
}

class Triangle extends Shape {
    // public void color() {
    //     System.out.println(this.color);
    // }
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

// Hierarchial Inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)r*r);
    }
}

// Multi Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h)
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

        t1.color();
    }
}