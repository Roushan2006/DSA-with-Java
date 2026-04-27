package OOP;

public class Abstraction {
    // Abstract class
    abstract static class Shape {
        String color;

        Shape(String color) {
            this.color = color;
        }

        // Abstract method (no implementation)
        abstract double area();

        // Concrete method
        public String getColor() {
            return color;
        }
    }

    // Subclass (Inherit from Shape)
    static class Circle extends Shape {
        double radius;

        Circle(double radius, String color) {
            super(color);
            this.radius = radius;
        }

        // Providing implementation for the abstract method
        @Override
        double area() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    // Interface
    interface Animal {
        void animalSound(); // Interface method (no body)
        void sleep();       // Interface method
        default void info() { // Default method (Java 8+)
            System.out.println("I am an animal.");
        }
    }

    // Pig "implements" the Animal interface
    static class Pig implements Animal {
        @Override
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }

        @Override
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Single main method to demonstrate both concepts
    public static void main(String[] args) {
        System.out.println("=== Abstract Class  ===");
        // You cannot instantiate an abstract class: Shape s = new Shape(); // Error!
        Shape circle = new Circle(5, "Red");
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.area());
        System.out.println();

        System.out.println("=== Interface  ===");
        Animal myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.info(); // Uses default method
    }
}