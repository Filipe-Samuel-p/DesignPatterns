package list_7.decorator.Exercise1;

class ShadowDecorator extends ShapeDecorator {
    public ShadowDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        super.draw();
        System.out.println(" -> Adding Shadow");
    }
}