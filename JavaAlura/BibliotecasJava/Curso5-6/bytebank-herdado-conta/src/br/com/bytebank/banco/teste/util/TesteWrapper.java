package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {
	public static void main(String[] args) {
		
		int idade = 29;
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);  // por baixo dos panos, o java transforma esse primitivo no seu objeto wrapper, para poder ser adicionado na lista, ja que as listas so aceitam referencias.
		numeros.add(30); //autoboxing, ou seja, transformar no objeto Wrapper automaticamente
		
		Integer idadeRef = Integer.valueOf(29); // essa função valueOf do Integer pega o valor primitivo e coloca na classe wrapper, o autoboxing feito na mao.
		int valor = idadeRef.intValue(); // essa função intValue pega o Integer e o transforma no seu tipo primitivo, ou seja, o unboxing.
		
		String s = "10";
		int numero = Integer.parseInt(s); // essa função ira pegar uma string ou um integer e vai transformala no tipo primitivo int.
		
		System.out.println(numeros.size());
	}
}
