package list_2.Exercise3;

public class Main {

    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment("1234567890123456"),
                new BankSlipPayment(),
                new PixPayment("user@email.com")
        };

        double[] amounts = {150.00, 89.90, 250.00};

        for (int i = 0; i < payments.length; i++) {
            System.out.println("\n--- Transaction " + (i+1) + " ---");
            payments[i].processPayment(amounts[i]);
        }
    }

}
