package list_2.Exercise3;

class CardPayment implements Payment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount +
                " on card **** " + cardNumber.substring(cardNumber.length()-4));
        System.out.println("Payment approved via credit card!");
    }
}