package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		// Generics === <????>
		ArrayList<Conta> lista = new ArrayList<Conta>(); //<Conta> especifica que nesse arryaList só pode existir elementos do tipo conta. Com isso torna desnecessario fazer os casts posteriormente
		
		ContaCorrente cc1 = new ContaCorrente(22, 33);
		ContaPoupanca cp1 = new ContaPoupanca(33, 22);
		ContaPoupanca cp2 = new ContaPoupanca(333, 222);
		ContaCorrente cc2 = new ContaCorrente(222, 333);
		ContaCorrente cc3 = new ContaCorrente(222, 333);
		
		lista.add(cc1);
		lista.add(cp1);
		lista.add(cp2);
		lista.add(cc2);
		
		boolean exist = lista.contains(cc2); // agora retorna true pois nos sobescrevemos o metodo equal na classe conta.
		System.out.println("ja existe: " + exist);
		
		boolean exist2 = lista.contains(cc3);
		System.out.println("ja existe: " + exist2); // mesmo as contas sendo iguais, o retorno é false, pois nesse caso que seria o '==' sao apenas relacionadas as referencias, que sao diferentes, mesmo com o mesmo conteudo.
		
//		for(Conta conta : lista) {
//			if(conta.ehIgual(cc3)) { // foi substituida pelo equals
//				System.out.println("Eh Igual");
//			}
//		}
		
//		for(Conta conta : lista) {  // para cada elemento do tipo Conta no ArrayList lista faça algo.
//			System.out.println(conta);
//		}
	}
}


//ArrayList funciona como os guardadores, porem extremamente melhor implementedos