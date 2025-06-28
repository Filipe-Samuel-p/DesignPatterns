package list_5.factoryMethod.Exercise4;

class DateFieldCreator extends FormFieldCreator {
    protected FormField create() {
        return new DateField();
    }
}