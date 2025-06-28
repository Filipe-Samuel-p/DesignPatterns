package list_5.abstractFactory.Exercise1;

class ClassicFactory implements ComponentFactory {
    public Button createButton() {
        return new ClassicButton();
    }
    public Window createWindow() {
        return new ClassicWindow();
    }
}
