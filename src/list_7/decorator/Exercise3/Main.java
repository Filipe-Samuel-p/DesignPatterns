package list_7.decorator.Exercise3;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new WordCountDecorator(new AutoCorrectDecorator(new SimpleEditor()));
        editor.type("This is teh test editor");
    }

}
