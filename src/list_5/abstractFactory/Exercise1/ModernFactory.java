package list_5.abstractFactory.Exercise1;

class ModernFactory implements ComponentFactory {
    public Button createButton() {
        return new ModernButton();
    }
    public Window createWindow() {
        return new ModernWindow();
    }
}
