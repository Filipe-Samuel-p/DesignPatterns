package list_7.decorator.Exercise1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new BorderDecorator(new Circle());
        circle.draw();

        System.out.println();

        Shape fancyRect = new ShadowDecorator(new BorderDecorator(new Rectangle()));
        fancyRect.draw();
    }
}
