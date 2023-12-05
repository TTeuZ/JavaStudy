package br.com.alura.teste;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando coleções", "eu");
		javaColecoes.adiciona(new Aula("testandoo", 15));
		javaColecoes.adiciona(new Aula("testandoo2", 12));
		javaColecoes.adiciona(new Aula("testandoo3", 11));
		
		Aluno a1 = new Aluno("paulo", 3123);
		Aluno a2 = new Aluno("isabela", 54335);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		
//		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
//		
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		
//		System.out.println("---------------------------------");
//		
//		Aluno paulo = new Aluno("paulo", 3123);
//		
//		System.out.println("O paulo esta matrioculado?");
//		System.out.println(javaColecoes.estaMatriculado(paulo)); // funciona agora pois foi implementado um hadcode especifico na classe aluno.
//		
//		System.out.println("O a1 é equals ao paulo?");
//		System.out.println(a1.equals(paulo));
//		
		
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		Iterator<Aluno> iterador = alunos.iterator(); // antigamente, a unica forma de fazer um for num Set era usando o iterador, pois como os Sets nao possuem index, era preciso alguma forma de perguntar se a colecao possuia um proximo elemento, e é isso que o iterator faz.
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
	}
}
