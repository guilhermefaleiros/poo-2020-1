import java.util.*;

public class CD {
    private String nome;
    private Date dataLancamento;
    private List<Pessoa> cantores = new ArrayList<>();

    public CD(String nome, Date dataLancamento, Pessoa cantor) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        adicionaCantor(cantor);
    }

    public void adicionaCantor(Pessoa p) {
        cantores.add(p);
    }

    public Pessoa removeCantor(int ordem) {
        return (Pessoa) (cantores.remove(ordem));
    }

    public String toString() {
        String saida = "CD: " + getNome() + "\nCantores:\n";
        for (Pessoa cantor : cantores) {
            saida += cantor.toString() + "\n";
        }
        return saida;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}