package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
				
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
//		System.out.println(aulas);
//		
//		aulas.remove(0);
//		
//		System.out.println(aulas);
//		
//		System.out.println("-----------------------------------");
//		
//		for (String aula : aulas) {
//			System.out.println(aula);
//		}
//		
//		String primeiraAula = aulas.get(0);
//		System.out.println(primeiraAula);
		
		aulas.forEach(aula -> System.out.println(aula));
		
		Collections.sort(aulas);
	}
}
