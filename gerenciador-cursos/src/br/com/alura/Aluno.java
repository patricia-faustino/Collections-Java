package br.com.alura;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null) {
            throw new NullPointerException("O nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {

        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " +
                "nome= " + nome + '\'' +
                ", numeroMatricula= " + numeroMatricula +
                "]";
    }

    //se implementar equals precisamos reescrever o hashcode para que não ocorra colisões e ao pesquisar a estrutura set se
    // perca, assim facilitando e evitando falso negativo


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getNumeroMatricula() == aluno.getNumeroMatricula() && getNome().equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
