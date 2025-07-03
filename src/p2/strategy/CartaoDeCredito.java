package p2.strategy;

public class CartaoDeCredito implements PagamentoStrategy {

    @Override
    public double pagar(double valor) {
        return valor * 2;
    }
}
