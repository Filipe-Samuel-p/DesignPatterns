package list_7.decorator.Exercise3;

class WordCountDecorator extends EditorDecorator {
    public WordCountDecorator(TextEditor editor) {
        super(editor);
    }

    public void type(String text) {
        super.type(text);
        int count = text.split(" ").length;
        System.out.println(" -> Word count: " + count);
    }
}
