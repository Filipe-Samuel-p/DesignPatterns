package list_7.decorator.Exercise2;

class BasicNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}