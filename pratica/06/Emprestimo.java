import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Pessoa funcionario;
    private Pessoa usuario;
    private Date data;

    public Emprestimo(Livro livro, Pessoa funcionario, Pessoa usuario, Date data) {
        this.livro = livro;
        this.funcionario = funcionario;
        this.usuario = usuario;
        this.data = data;
    }

    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + "\n" + "Funcionario: " + funcionario.getNome() + "\n"
                + "Usuario: " + usuario.getNome() + "\n" + "Data: " + getData().toString();
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}