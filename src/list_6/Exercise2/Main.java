package list_6.Exercise2;

public class Main {
    public static void main(String[] args) {
        CardPayment payment = new BoletoToCardAdapter(new BoletoPayment());
        payment.pay();
    }

}
