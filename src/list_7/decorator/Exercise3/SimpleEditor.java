package list_7.decorator.Exercise3;

class SimpleEditor implements TextEditor {
    public void type(String text) {
        System.out.println("Typing: " + text);
    }
}