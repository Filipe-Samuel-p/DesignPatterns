package list_7.decorator.Exercise3;

abstract class EditorDecorator implements TextEditor {
    protected TextEditor editor;

    public EditorDecorator(TextEditor editor) {
        this.editor = editor;
    }

    public void type(String text) {
        editor.type(text);
    }
}