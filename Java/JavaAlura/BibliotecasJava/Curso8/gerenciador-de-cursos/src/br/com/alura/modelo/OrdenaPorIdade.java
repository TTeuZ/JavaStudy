package br.com.alura.modelo;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		Integer i1 = f1.getIdade();
		return i1.compareTo(f2.getIdade());
	}

}
