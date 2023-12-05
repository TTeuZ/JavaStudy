package br.paulo.exercicios.treino.Warmup2.modulo;

// dada uma string  e um numero nao negativo, retorne uma outra string com as repetiçoes dos 3 primeiros caracteres da string
// caso a string tenha um length menor que 3, retorne o numero n de repetiçoes da string.

public class frontTimes {
	public String fronttimes(String str, int n) {
		String result = "";
		if (str.length() <= 3) {
			for(int i = 0; i < n; i++) {
				result = result.concat(str);
			}
		} else {
			String subs = str.substring(0, 3);
			for(int i = 0; i < n; i++) {
				result = result.concat(subs);
			}
		}
		
		return result;
	}
}


// funcional;