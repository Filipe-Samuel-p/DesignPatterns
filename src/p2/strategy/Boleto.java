package p2.strategy;

public class Boleto implements PagamentoStrategy {
    @Override
    public double pagar(double valor) {
        return valor * 3;
    }
}
