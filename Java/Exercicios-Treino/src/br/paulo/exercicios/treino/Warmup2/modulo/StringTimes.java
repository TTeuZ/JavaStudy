package br.paulo.exercicios.treino.Warmup2.modulo;

// Dado uma string e um numero nao negativo, retorne a string repetida pela quantidade de n do numero;

public class StringTimes {
	public String stringTimes(String str, int n) {
		int contador = 1;
		String strFinal = "";
		
		
		while (contador <= n) {
			strFinal = strFinal.concat(str);
			contador++;
		}
		
		return strFinal;
	}
}

// FUncional.