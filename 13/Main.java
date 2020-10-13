public class Main {

    public static void main(String[] args) {
        // Adicionando alunos em uma escola
        Escola escola = new Escola();
        escola.setNome("Escola Raio de Sol");

        escola.adicionarAluno(new Aluno(1, "Guilherme"));
        escola.adicionarAluno(new Aluno(2, "Fábio"));
        escola.adicionarAluno(new Aluno(3, "Jorge"));

    }
}
