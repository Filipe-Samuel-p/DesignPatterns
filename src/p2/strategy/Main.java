package p2.strategy;

public class Main {
    public static void main(String[] args) {

        Carrinho carrinho1 = new Carrinho(new Boleto());
        Carrinho carrinho2 = new Carrinho(new CartaoDeCredito());
        Carrinho carrinho3 = new Carrinho(new Pix());

        System.out.println(carrinho1.pagarProduto(2));
        System.out.println(carrinho2.pagarProduto(2));
        System.out.println(carrinho3.pagarProduto(2));

    }
}
