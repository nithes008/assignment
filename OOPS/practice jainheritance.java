
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Inherited method from Animal class
        myDog.eat(); 
        
        // Own method of Dog class
        myDog.bark(); 
    }
}
