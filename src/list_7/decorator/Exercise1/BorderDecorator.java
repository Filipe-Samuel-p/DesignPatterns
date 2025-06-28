package list_7.decorator.Exercise1;

class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        super.draw();
        System.out.println(" -> Adding Border");
    }
}