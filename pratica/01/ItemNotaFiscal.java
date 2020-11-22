public class ItemNotaFiscal {
    private Produto produto;
    private int quantidade;

    public ItemNotaFiscal(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public float getTotal() {
        float precoComImposto = produto.getPreco() * (1 + produto.getAliquota());
        return quantidade * precoComImposto;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
