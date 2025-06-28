package list_5.abstractFactory.Exercise3;

class EmailFactory implements NotifierFactory {
    public Notifier createNotifier() {
        return new EmailNotifier();
    }
}