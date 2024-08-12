import entities.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.addAluno("betin", "adress", "mat");
        aluno.addAluno("jon doe", "rua 2", "prog");
        aluno.listarAlunos();
        aluno.addAluno("betin", "adress", "mat");
    }
}