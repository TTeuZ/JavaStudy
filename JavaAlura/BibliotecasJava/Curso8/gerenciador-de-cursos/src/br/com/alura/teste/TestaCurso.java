package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando coleções", "eu");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		aulas.add(new Aula("trabalhando com arrayList", 21));
//		System.out.println(aulas);
		
//		javaColecoes.getAulas().add(new Aula("teste2", 16)); // agora vai jogar uma exceção, pois a lista do get aulas é apenas read only
		
		javaColecoes.adiciona(new Aula("testandoo", 15));
		javaColecoes.adiciona(new Aula("testandoo2", 12));
		javaColecoes.adiciona(new Aula("testandoo3", 11));
		
//		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
//		Collections.sort(aulasImutaveis); // Nao ira funcionar por causa que o get aulas manda apenas uma lista imutavel. 
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis); // criei uma array list a partir da lista de aulas imutaveies
		Collections.sort(aulas); // agora e possivel usar o sort
		System.out.println(aulas);
		
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
	}
}
