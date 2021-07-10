package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);
         
         List<Conta> lista = new ArrayList<>();
         lista.add(cc1);
         lista.add(cc2);
         lista.add(cc3);
         lista.add(cc4);
         
         // utilização dos lambdas, sao identificados pela '->'
         // nao precisa das chaves e do return
         // como a lista ja é de contas, nao precisamos identificas no c1 e c2
         
         lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
            
         // outra utilização do lambda, vulgo, arrow function
         Comparator<Conta> comp = (Conta c1, Conta c2) -> {
       		String nomeC1 = c1.getTitular().getNome();
        	String nomeC2 = c2.getTitular().getNome();
        	return nomeC1.compareTo(nomeC2);
        };
        
//        for (Conta conta : lista) {  a propia lista ja possui um for each
//			System.out.println(conta);
//		}
        
        // outro uso da lambda
        // nao preciso especificar o tipo da conta, pois a lista é de Contas
        // nao é necessario o return e as '{}' porque possui apenas uma linha e uma saida explicita sem outras regulamentaçoes
        // a arrow funciton ja delimita o retorno
        lista.forEach((conta) -> System.out.println(conta));
	}
}