package list_5.abstractFactory.Exercise4;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new FireKingdomFactory();
        Character warrior = factory.createWarrior();
        Character mage = factory.createMage();

        warrior.show();
        mage.show();
    }

}
