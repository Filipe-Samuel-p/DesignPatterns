package list_4.exercise5;

public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        registry.add("rectangle", new Rectangle(10, 20, "black"));
        registry.add("circle", new Circle(15, 25, "yellow"));

        Shape copy1 = registry.clone("rectangle");
        Shape copy2 = registry.clone("circle");

        System.out.println(copy1);
        System.out.println(copy2);
    }
}
