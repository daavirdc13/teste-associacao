package academy.devdojo.maratonajava.javacore.GProjeto.Test;

import academy.devdojo.maratonajava.javacore.GProjeto.Dominio.Aluno;
import academy.devdojo.maratonajava.javacore.GProjeto.Dominio.Local;
import academy.devdojo.maratonajava.javacore.GProjeto.Dominio.Professor;
import academy.devdojo.maratonajava.javacore.GProjeto.Dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Paulista");
        Local local1 = new Local("Brigadeiro");
        Aluno aluno = new Aluno("Tiphany", 19);
        Professor professor = new Professor("Jiraya", "História");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);
        Seminario seminario1 = new Seminario("Onde achar", alunosParaSeminario, local1);


        Seminario[] seminariosDisponiveis = {seminario, seminario1};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
