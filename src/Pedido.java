public class Pedido {
    private int pedido;
    private Produto[] produtos;

    public Pedido(int pedido) {
        this.pedido = pedido;
    }

    public Pedido(int pedido, Produto[] produtos) {
        this.pedido = pedido;
        this.produtos = produtos;
    }

    public void print(){
        System.out.println("#------------------#");
        System.out.println("Pedido: " + this.pedido);
        System.out.println("#------------------#");
        for(Produto produto : this.produtos){
            System.out.println("Item: " + produto.getNome() + " | Preço: " + produto.getValor());
        }
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}
