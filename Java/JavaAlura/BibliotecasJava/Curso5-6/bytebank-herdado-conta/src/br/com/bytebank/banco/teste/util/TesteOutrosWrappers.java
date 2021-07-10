package br.com.bytebank.banco.teste.util;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		Double dRef = Double.valueOf(3.2); //autoboxig
		System.out.println(dRef); //unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef);
	}
}


// aparentemente nessa versao do java, se voce chamar o dRef sem o doubleValor no caso, ele ira retornar da mesma maneira, provavelmente foram autalizaçoes de melhoria.
// todas as classes numericas se extendem de uma classe mae chamada Number.