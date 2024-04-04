public class Relatorio {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Coca-cola", 5.50f);
        Produto produto2 = new Produto("Pepsi", 3.50f);
        Produto produto3 = new Produto("Big-Mac", 7.50f);
        Produto produto4 = new Produto("Batata frita", 4.50f);

        Produto[] produtosDoPedido = {produto1, produto2, produto3, produto4};

        Pedido pedido1 = new Pedido(123, produtosDoPedido);

        pedido1.setProdutos(produtosDoPedido);
        pedido1.print();

    }
}
