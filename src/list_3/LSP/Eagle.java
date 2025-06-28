package list_3.LSP;

class Eagle extends Bird implements Flyable {
    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Eagle soaring high in the sky!");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle: Screech!");
    }
}