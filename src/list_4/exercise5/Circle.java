package list_4.exercise5;

class Circle extends Shape {
    public Circle(int x, int y, String color) {
        super(x, y, color);
    }

    public Shape clone() {
        return new Circle(x, y, color);
    }
}