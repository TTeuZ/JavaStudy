package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDePrimitivo {
	public static void main(String[] args) {
		Object conta = new ContaCorrente(222, 333);
		
//		System.out.println(conta);
		
		// Arrays
		int[] idades = new  int[5];  // instanciando um arry com 5 espaços
		
		idades[0] = 29;
//		int i = idades[0];
		
//		System.out.println(i);
		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i ++) {
			System.out.println(idades[i]);
		}
		
	}
}

