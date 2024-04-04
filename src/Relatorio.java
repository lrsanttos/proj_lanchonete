public class Relatorio {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Coca-cola", 5.50f);
        Produto produto2 = new Produto("Pepsi", 3.50f);
        Pedido pedido1 = new Pedido(123);

        Produto[] produtos = {produto1, produto2};

        pedido1.setProdutos(produtos);
        pedido1.print();

    }
}
