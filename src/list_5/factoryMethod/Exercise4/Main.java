package list_5.factoryMethod.Exercise4;

public class Main {
    public static void main(String[] args) {
        FormFieldCreator creator = new EmailFieldCreator();
        FormField field = creator.createField();
        field.render();
    }

}
