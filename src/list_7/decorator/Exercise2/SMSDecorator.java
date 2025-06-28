package list_7.decorator.Exercise2;

class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println(" -> Sending SMS: " + message);
    }
}