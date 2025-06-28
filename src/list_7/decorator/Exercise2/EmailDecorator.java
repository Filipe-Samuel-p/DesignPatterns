package list_7.decorator.Exercise2;

class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println(" -> Sending Email: " + message);
    }
}