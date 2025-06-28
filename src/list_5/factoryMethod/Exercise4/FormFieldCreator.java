package list_5.factoryMethod.Exercise4;

abstract class FormFieldCreator {
    public FormField createField() {
        return create();
    }

    protected abstract FormField create();
}