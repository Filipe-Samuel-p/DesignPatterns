package list_5.factoryMethod.Exercise1;

class TextEditor extends Editor {
    protected Document createDocument() {
        return new TextDocument();
    }
}