class Shape {
    // Overriding target
    void draw() {
        System.out.println("Drawing a shape");
    }

    // Method Overloading: Same method name, different parameters
    void draw(int size) {
        System.out.println("Drawing a shape of size: " + size);
    }
}

class Circle extends Shape {
    // Method Overriding: Changing implementation in subclass
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape myShape = new Circle(); 
        myShape.draw();       // Runtime Polymorphism (Calls Circle's draw)

        Shape genericShape = new Shape();
        genericShape.draw(10); // Compile-time Polymorphism (Calls overloaded draw)
    }
}
