package list_5.abstractFactory.Exercise2;

class EasyBoss implements Enemy {
    public void attack() {
        System.out.println("Easy boss attacks moderately.");
    }
    public void showHealth() {
        System.out.println("Health: 100");
    }
}
