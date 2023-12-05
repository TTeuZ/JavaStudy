package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // retornar uma lista 'read only', para evitar utilização de metodos sobre o getAulas.
	}
	public String getNome() {
		return nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + ", alunos=" + alunos + "]";
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
//		int tempoTotal = 0;  metodo antigo
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // metodo implementado apois java 8
	}

	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula nao encontrada " + numero);  metodo para usar sem o map, muito custoso e lento
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}
}

// OBS getTempoTotal: a função stream foi implementada no java 8
// o MapToInt vai pegar todos os valores colocados em seu parametro e transformalos em int
// no caso o parametro e o aula puxando a função getTempo, ou seja, para puxar o tempo das aulas
// por ultimo é realizado uma soma de todos os valores puxados.

// POdemos usar o LinkedHashSet, ele tbm nao possui os metodos get e etc. pois ele nao possui um index dos elementos adicionados
// porem, este nos mostra os elementos na ordem em que eles foram adicionados.

//




