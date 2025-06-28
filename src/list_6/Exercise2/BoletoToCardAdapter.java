package list_6.Exercise2;

class BoletoToCardAdapter implements CardPayment {
    private BoletoPayment boleto;

    public BoletoToCardAdapter(BoletoPayment boleto) {
        this.boleto = boleto;
    }

    public void pay() {
        boleto.payBoleto();
    }
}