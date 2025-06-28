package list_5.factoryMethod.Exercise4;

class TextFieldCreator extends FormFieldCreator {
    protected FormField create() {
        return new TextField();
    }
}