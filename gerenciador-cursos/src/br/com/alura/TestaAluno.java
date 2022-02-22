package br.com.alura;

import java.util.*;

public class TestaAluno {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<String>();
        alunos.add("Patricia Faustino");
        alunos.add("Maria Cerqueira");
        alunos.add("Libertina Souza");
        alunos.add("Aritrudes Sampaio");
        alunos.add("Issa Brito");
        alunos.add("Lovelace Camargo");

        System.out.println(alunos);

        System.out.println(alunos.contains("Paulo Siqueira"));

        alunos.add("Issa Brito");

        alunos.forEach(x -> System.out.println(x));
        System.out.println(alunos.size());

        List<String> alunosList = new ArrayList<>(alunos);
    }
}
