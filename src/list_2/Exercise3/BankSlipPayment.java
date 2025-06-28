package list_2.Exercise3;

class BankSlipPayment implements Payment {
    private String barcode;

    public BankSlipPayment() {
        this.barcode = generateBarcode();
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Generating bank slip for $" + amount);
        System.out.println("Barcode: " + barcode);
        System.out.println("Payment processed via bank slip!");
    }

    private String generateBarcode() {
        return "23791234567890123456789012345678901234";
    }
}
