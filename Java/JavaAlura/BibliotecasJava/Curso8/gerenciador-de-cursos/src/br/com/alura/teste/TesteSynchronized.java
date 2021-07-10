package br.com.alura.teste;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.alura.modelo.Aluno;

public class TesteSynchronized {
	public static void main(String[] args) {
		
		
		Set<Aluno> alunos = new HashSet<>();
		
		alunos.add(new Aluno("teste", 4324));
		alunos.add(new Aluno("teste2", 43246));
		alunos.add(new Aluno("teste3", 43244));
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		
		System.out.println(alunosSincronizados);
	}
}

// teoricamente esse metodo synchronizedSet transforma o set em um set capaz de ser utilizado em thread, ou seja
// ele pode ser usado em paralelo com outros processos.