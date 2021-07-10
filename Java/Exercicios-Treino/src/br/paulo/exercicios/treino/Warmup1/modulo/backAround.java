package br.paulo.exercicios.treino.Warmup1.modulo;

// dado uma string, pega o ultimo caracter a adicona na frente e no final da frase

public class backAround {
	public  String backaround(String str) {
		char charAt = str.charAt(str.length() - 1);
		String retorno = charAt + str + charAt;
		return retorno;
	}
}

//funcional