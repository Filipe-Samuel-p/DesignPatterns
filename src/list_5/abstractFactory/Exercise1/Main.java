package list_5.abstractFactory.Exercise1;

public class Main {
    public static void main(String[] args) {
        ComponentFactory factory = new ModernFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.draw();
        window.display();
    }

}
