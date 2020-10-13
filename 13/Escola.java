import java.util.ArrayList;
import java.util.List;

public class Escola {

    private int id;
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Escola() {
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
