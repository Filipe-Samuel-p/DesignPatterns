package list_7.decorator.Exercise3;

class AutoCorrectDecorator extends EditorDecorator {
    public AutoCorrectDecorator(TextEditor editor) {
        super(editor);
    }

    public void type(String text) {
        text = text.replace("teh", "the");
        super.type(text);
    }
}
