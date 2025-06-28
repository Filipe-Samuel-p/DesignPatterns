package list_5.factoryMethod.Exercise1;

abstract class Editor {
    public void open() {
        Document doc = createDocument();
        doc.showType();
    }

    protected abstract Document createDocument();
}
