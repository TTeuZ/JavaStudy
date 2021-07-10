package br.com.alura.teste;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando coleções", "eu");
		javaColecoes.adiciona(new Aula("testandoo", 15));
		javaColecoes.adiciona(new Aula("testandoo2", 12));
		javaColecoes.adiciona(new Aula("testandoo3", 11));
		
		Aluno a1 = new Aluno("paulo", 3123);
		Aluno a2 = new Aluno("isabela", 54335);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		
		System.out.println("quem é o aluno com a matricula 3123?");
		Aluno aluno = javaColecoes.buscaMatricula(3123);
		System.out.println(aluno);
	}
}
