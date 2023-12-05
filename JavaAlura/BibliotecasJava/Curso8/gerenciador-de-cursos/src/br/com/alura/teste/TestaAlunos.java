package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("rodrigo");
		alunos.add("jose");
		alunos.add("paulo");
		alunos.add("gustavo");
		alunos.add("reginaldo");
		alunos.add("isabela s2");
		alunos.add("renan");
		alunos.add("renan");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		System.out.println(alunos.size());
		
		System.out.println(alunos);
	}
}


// usando o set, e o hashSet, voce nao tem garantia da ordem que os itens iram aparecer nessa lista
// Nao aceita elementos repetidos.
// caso eu adicione mais de um elemento igual, ele so vai contar como um, em qualquer caso.

// os sets podem ter grande ganhos de velocidade. no caso como contains e remove.