package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorGenerico;

public class TesteGuardadorGenerico {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(22, 33);
		ContaPoupanca cp1 = new ContaPoupanca(33, 22);
		
		GuardadorGenerico guardador = new GuardadorGenerico();
		
		guardador.adiciona(cc1);
		guardador.adiciona(cp1);
		
		System.out.println(guardador.getQuantidadeDeElementos());
		
		Conta ref = (Conta) guardador.getReferencia(0);
		
		System.out.println(ref.getAgencia());
	}
}
