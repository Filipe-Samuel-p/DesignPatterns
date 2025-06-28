package list_5.abstractFactory.Exercise2;

class EasySoldier implements Enemy {
    public void attack() {
        System.out.println("Easy soldier attacks lightly.");
    }
    public void showHealth() {
        System.out.println("Health: 50");
    }
}
