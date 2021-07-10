package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {
	public static void main(String[] args) {
	// Generics === <????>
	ArrayList<Conta> lista = new ArrayList<Conta>(); //<Conta> especifica que nesse arryaList só pode existir elementos do tipo conta. Com isso torna desnecessario fazer os casts posteriormente
	
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
	
//	for (int i = 0; i < lista.size(); i++) {  For mais antigo
//		Object ref = lista.get(i);
//		System.out.println(ref);
//	}
	
	for(Conta conta : lista) {  // para cada elemento do tipo Conta no ArrayList lista faça algo.
		System.out.println(conta);
	}
}
}


//ArrayList funciona como os guardadores, porem extremamente melhor implementedos

// o problema principal do ArrayList é que quando voce apaga um elemento, ele precisa se reorganizar para nao deixar 'buracos' e isso é um tremendo pesadelo.