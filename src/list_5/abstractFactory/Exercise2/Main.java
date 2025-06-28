package list_5.abstractFactory.Exercise2;

public class Main {

    public static void main(String[] args) {
        EnemyFactory factory = new EasyLevelFactory();
        Enemy soldier = factory.createSoldier();
        Enemy boss = factory.createBoss();

        soldier.attack();
        boss.showHealth();
    }
}
