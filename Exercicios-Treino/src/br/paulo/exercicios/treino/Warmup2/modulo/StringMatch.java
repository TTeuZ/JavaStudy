package br.paulo.exercicios.treino.Warmup2.modulo;

// dado duas strings, retorne o numero de vezes que suas substrings de length 2, sejam iguais e na mesma posição.

public class StringMatch {
	public int stringMatch(String a, String b) {
		int result = 0;
		int menorTamanhoDaString = a.length() > b.length() ? b.length() : a.length();
		
		for (int i = 0; i <= menorTamanhoDaString - 2; i++) {
			String aSubs = a.substring(i, i + 2);
			String bSubs = b.substring(i, i + 2);
			
			if ( aSubs.equals(bSubs)) {
				result++;
			}
		}
		
		return result;
	}
}

// funcional;