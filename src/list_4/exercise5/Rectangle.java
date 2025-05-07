package list_4.exercise5;

class Rectangle extends Shape {
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
    }

    public Shape clone() {
        return new Rectangle(x, y, color);
    }
}