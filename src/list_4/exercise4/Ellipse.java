package list_4.exercise4;

class Ellipse extends Shape {
    public Ellipse(int x, int y, String color) {
        super(x, y, color);
    }

    public Shape clone() {
        return new Ellipse(x, y, color);
    }
}
