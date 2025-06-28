package list_5.abstractFactory.Exercise2;

class EasyLevelFactory implements EnemyFactory {
    public Enemy createSoldier() {
        return new EasySoldier();
    }
    public Enemy createBoss() {
        return new EasyBoss();
    }
}