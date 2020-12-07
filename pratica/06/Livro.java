public class Livro {
    private String titulo;
    private int ano;
    private Editora editora;
    private Pessoa autor;

    public Livro(String titulo, Editora editora, Pessoa autor, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}