package list_5.abstractFactory.Exercise3;

public class Main {
    public static void main(String[] args) {
        NotifierFactory factory = new EmailFactory();
        Notifier notifier = factory.createNotifier();
        notifier.send("Welcome!");
    }


}
