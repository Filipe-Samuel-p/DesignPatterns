package list_4.exercise4;

abstract class Shape {
    protected int x, y;
    protected String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (x=" + x + ", y=" + y + ", color=" + color + ")";
    }
}
