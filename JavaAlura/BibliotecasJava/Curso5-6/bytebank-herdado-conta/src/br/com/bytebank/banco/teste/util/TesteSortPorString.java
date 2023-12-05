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

public class TesteSortPorString {
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
         
         for (Conta conta : lista) {
			System.out.println(conta);
		 }
         
//         System.out.println("------------------------------------------------------------");
//         Comparador comparador = new Comparador();
//         lista.sort(new TitularDaContaComparator());
//         System.out.println("------------------------------------------------------------");
         
         // antes do java 8 sexistia uma classe que ja possuia os metodos de sort, ela é a Collections
//       Collections.sort(lista); // esse metodo utiliza a Ordem natural* para ordenar
         Collections.sort(lista, new TitularDaContaComparator()); // funciona como o comparador da lista, ele recebe uma lista e um comparador
         
         // a Collections possui outras funçoes estaticas muito relevantes como a reverse.
         
         Collections.reverse(lista);
               
         
         for (Conta conta : lista) {
 			System.out.println(conta);
 		 }
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2); // esse metodo ja possui o metodo de comparação interno, nao sendo necessario instanciar aqui, ele mesmo ja faz todo o trabalho.
	}
	
}

class Comparador implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero()); // função que faz o mesmo que o restante mas inbutida na Wrapper
		
//		return c1.getNumero() - c2.getNumero(); // faz o mesmo que os ifs.
		
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
	}
}

// Para realizar o sort aqui, precisamos passar um comparador, esse comparador implementa uma interface Comparator que possui a função compare
// essa função possui uma regra padrao, se um valor foi menor que o outro retorne um valor negativo
// e se um valor for maior que o outro retorne um valor positivo
// instanciando essas comparaçoes voce consegue criar o comparador e utiliza-lo no .sort


// * a Ordem natural é utilizada quando nao é definico um comparador, podemos pensar ela como o normal em uma ordenação, como seguencia numerica, ordem alfabetica, etc.
// porem ele precisa ser defenida na classe que ira tela.



