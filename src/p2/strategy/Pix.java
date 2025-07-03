package p2.strategy;

public class Pix implements PagamentoStrategy {
    @Override
    public double pagar(double valor) {
        return valor * 1;
    }
}
