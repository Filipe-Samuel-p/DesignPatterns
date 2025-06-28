package list_5.factoryMethod.Exercise4;

class EmailFieldCreator extends FormFieldCreator {
    protected FormField create() {
        return new EmailField();
    }
}
