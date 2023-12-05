package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencia {
	public static void main(String[] args) {
//		Conta[] contas = new Conta[5];
//		ContaCorrente cc1 = new ContaCorrente(22, 33);
//		contas[0] = cc1;
//		
//		System.out.println(cc1.getNumero());
//		System.out.println(contas[0].getNumero());
//		
//		ContaPoupanca cp1 = new ContaPoupanca(33, 22);
//		contas[1] = cp1;
//		
////		Conta ref = contas[1]; // funciona pois conta é o objeto mais generico
////		ContaPoupanca ref = contas[1];   //#1
//		ContaPoupanca ref = (ContaPoupanca) contas[1]; // forçado com typeCast
		
		
		// o array mais generico
		Object[] referencias = new Object[5]; // no caso de utilizar a referencia mais generica, é sempre necessario utilizar o type Cast, se nao ele nao encontrara os metodos e atributos especificos.
	}
}


// #1 nesse caso, o compilador nao aceita esse metodo, pois como foi instanciado o array como modo 'Conta', ele sabe que o array pode apontar tanto para um objeto tipo
// conta corrente quanto para um objeto tipo conta poupanca, e por nao saber especificadamente qual é o tipo de objeto, mesmo instanciando um objeto tipo CP
// o compilador acusa erro, e para isso temos que forçar o tipo usando typeCast.