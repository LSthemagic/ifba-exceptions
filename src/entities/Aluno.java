package entities;

import entities.exceptions.AlreadyExistsExecption;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Aluno {
    private String nome, endereco, matricula;
    private final List<Aluno> list = new ArrayList();

    public Aluno() {
    }

    private Aluno(String nome, String endereco, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void addAluno(String nome, String endereco, String matricula){
        boolean exists = list.stream().anyMatch(
                x-> x.getMatricula().equals(matricula)
        );

        if(exists){
            throw new AlreadyExistsExecption("O aluno de matricula:"+ matricula +" ja esta cadastrado");
        }
        list.add(new Aluno(nome, endereco, matricula));
    }

    public void listarAlunos(){
        list.forEach(x-> System.out.println(x.toString()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
