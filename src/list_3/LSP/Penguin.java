package list_3.LSP;

class Penguin extends Bird implements Swimmable {
    @Override
    public void move() {
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Penguin swimming gracefully!");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin: Squawk!");
    }
}