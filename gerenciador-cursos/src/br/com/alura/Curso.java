package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private int total = 0;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        //devolve uma cópia de lista, defensiva
        return Collections.unmodifiableList(aulas);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
        this.total += aula.getTempo();
    }

    @Override
    public String toString() {
        return "[ Curso: " +
                "nome = " + this.nome +
                ", tempo total=" + total +
                " " + this.getAulas() +
                ']';
    }
}
