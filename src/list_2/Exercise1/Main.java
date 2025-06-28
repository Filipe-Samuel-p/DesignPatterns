package list_2.Exercise1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Circle(3.0),
                new Rectangle(2.5, 8.0)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }

}
