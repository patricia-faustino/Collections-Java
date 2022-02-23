package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java",
                "Paulo Siveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 34673);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");

        System.out.println(javaColecoes.getAlunos());

        boolean estaMatriculado = javaColecoes.estaMatriculado(a1);

        System.out.println("O aluno " + a1.getNome() + " está matriculado? " + estaMatriculado);

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println();

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
       // iterador.next();
    }

}
