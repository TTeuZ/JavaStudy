package br.com.alura.teste;

import java.util.ArrayList;
import java.util.HashSet;

public class TestePerformance {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i <= 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("tempo gasto: " + tempoDeExecucao);
		
		System.out.println("----------------------------------------------------------------");
		
		HashSet<Integer> numerosHash = new HashSet<>();
		
		long inicioHash = System.currentTimeMillis();
		
		for(int i = 0; i <= 50000; i++) {
			numerosHash.add(i);
		}
		
		for (Integer numeroH : numerosHash) {
			numerosHash.contains(numeroH);
		}
		
		long fimHash = System.currentTimeMillis();
		
		long tempoDeExecucaoHash = fimHash - inicioHash;
		
		System.out.println("tempo gasto: " + tempoDeExecucaoHash);
		
	}
}
