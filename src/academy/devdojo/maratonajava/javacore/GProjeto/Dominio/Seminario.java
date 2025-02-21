package academy.devdojo.maratonajava.javacore.GProjeto.Dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
