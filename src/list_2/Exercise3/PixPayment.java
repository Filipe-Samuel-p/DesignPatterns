package list_2.Exercise3;

class PixPayment implements Payment {
    private String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PIX payment of $" + amount);
        System.out.println("PIX Key: " + pixKey);
        System.out.println("Instant transfer completed!");
    }
}