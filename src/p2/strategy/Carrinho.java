package p2.strategy;

public class Carrinho {

    private PagamentoStrategy pagamentoStrategy;

    public Carrinho(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public double pagarProduto(double valor) {
        return pagamentoStrategy.pagar(valor);
    }

}
