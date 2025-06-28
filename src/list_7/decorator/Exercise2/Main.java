package list_7.decorator.Exercise2;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailDecorator(new SMSDecorator(new BasicNotifier()));
        notifier.send("System update available!");
    }
}

