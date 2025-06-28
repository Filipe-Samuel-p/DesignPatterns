package list_5.factoryMethod.Exercise1;

class SpreadsheetEditor extends Editor {
    protected Document createDocument() {
        return new SpreadsheetDocument();
    }
}
