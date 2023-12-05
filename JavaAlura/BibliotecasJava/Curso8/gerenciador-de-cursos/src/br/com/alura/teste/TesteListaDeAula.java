package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.modelo.Aula;

public class TesteListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("vendo array", 21);
		Aula a2 = new Aula("Avendo array2", 15);
		Aula a3 = new Aula("Dvendo array3", 19);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println("-----------------------------");
		System.out.println(aulas);
		
		// essa linha esta utilizando diretamente o Comparator do java.Util usando o metodo comparing
		// nele voce passa uma chave, que ira vir da classe que voce quer buscar a comparação, no caso aula 
		// o '::' é a nomenclatura para acessar uma função dessa classe pelo comparing
		// nesse caso nos estamos adentrando na classe aula e buscando a função getTempo
		// o metodo comparing ira fazer as regras de comparação automaticamente
		aulas.sort(Comparator.comparing(Aula::getTempo)); 
		
		System.out.println("-----------------------------------");
		System.out.println(aulas);
	}
}
