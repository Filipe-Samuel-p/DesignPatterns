package list_5.abstractFactory.Exercise3;

class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

