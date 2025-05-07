package list_4.exercise4;

class Triangle extends Shape {
    public Triangle(int x, int y, String color) {
        super(x, y, color);
    }

    public Shape clone() {
        return new Triangle(x, y, color);
    }
}