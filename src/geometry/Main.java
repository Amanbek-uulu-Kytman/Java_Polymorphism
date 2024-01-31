package geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(7);

        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
