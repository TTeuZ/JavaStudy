package br.com.alura.teste;

import java.util.Collections;
import java.util.Set;

public class TesteEmpytSet {
	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");
	}
}

// um conjunto feito vazio nao pode receber elementos.