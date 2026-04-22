
public class polymorphism {

    // Static nested class for method overloading example
    public static class Calc {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Base class
    static class Animal {
        void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }

    // Subclass Dog
    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("The dog says: Bow Wow");
        }
    }

    // Subclass Cat
    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("The cat says: Meow");
        }
    }

    public static void main(String[] args) {
        // Example 1: Method overloading (compile‑time polymorphism)
        Calc calc = new Calc();
        System.out.println("add(10, 20): " + calc.add(10, 20));      // Output: 30
        System.out.println("add(10, 20, 30): " + calc.add(10, 20, 30)); // Output: 60

        // Example 2: Runtime polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: The dog says: Bow Wow
        myCat.makeSound(); // Output: The cat says: Meow
    }
}