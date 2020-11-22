public class Produto {
    private float preco;
    private float aliquota;
    private String descricao;

    public Produto(float preco, float aliquota, String descricao) {
        this.aliquota = aliquota;
        this.preco = preco;
        this.descricao = descricao;
    }

    public float getAliquota() {
        return aliquota;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }
}
