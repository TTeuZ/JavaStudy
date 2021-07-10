package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedList {
	public static void main(String[] args) {
		// Generics === <????>
		List<Conta> lista = new LinkedList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(22, 33);
		ContaPoupanca cp1 = new ContaPoupanca(33, 22);
		ContaPoupanca cp2 = new ContaPoupanca(333, 222);
		ContaCorrente cc2 = new ContaCorrente(222, 333);

		lista.add(cc1);
		lista.add(cp1);
		lista.add(cp2);
		lista.add(cc2);

		System.out.println("tamanho: " + lista.size());
		lista.remove(0);
		System.out.println("tamanho: " + lista.size());

		
		for (Conta conta : lista) { // para cada elemento do tipo Conta no ArrayList lista faça algo.
			System.out.println(conta);
		}
	}
}

// linkedList soluciona o problema de exluir elementos, pois ele funciona de uma maneria duplamente encadeada
// o elemento tem uma conexao com o proximo e o proximo sabe quem é o anterior conectado a ele
// entao, o primeiro elemento é aquele que nao tem nenhum anterior conectado e o ultimo é o que nao tem nenhum proximo
// caso eu apague o primeiro elemento, o proximo ja se torna obrigatoriamente o primeiro pois ele nao possui nenhum conectado, o mesmo vale para o ultimo
// caso eu apague algum elemento do meio, as reconecçoes sao feitas automaticamente

// o problema do linkedList é que voce nao tem acesso direto ao elementos, se voce quer interar algo, voce obrigadotoriamente começa no primeiro elemento e caminha até  o elemento desejado
// entao, caso voce precise interar muito sobre a lista, e se ela for deveras comprida, o LinkedList pode ser um problema.


// tanto o LinkedList e o ArrayList assinam um contrato, ou seja, possuem uma interface, que é a list, ela é o generico.


// Possuimo tbm o Vector, porem ele é utilizado em um caso mais especifico quando voce precisa interar uma lista que pode sr modificada por varias pilhas diferentes.



