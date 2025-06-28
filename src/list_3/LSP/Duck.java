package list_3.LSP;

class Duck extends Bird implements Flyable, Swimmable {
    @Override
    public void move() {
        System.out.println("Duck can choose to fly or swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck flying across the pond!");
    }

    @Override
    public void swim() {
        System.out.println("Duck paddling in the water!");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck: Quack!");
    }
}