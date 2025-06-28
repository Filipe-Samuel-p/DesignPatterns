package list_5.abstractFactory.Exercise4;

class FireKingdomFactory implements CharacterFactory {
    public Character createWarrior() {
        return new FireWarrior();
    }
    public Character createMage() {
        return new FireMage();
    }
}