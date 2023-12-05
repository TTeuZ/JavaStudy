package br.paulo.exercicios.treino.Warmup2.modulo;

// dado uma string, retorne o numero que indica quantas vezes temos uma string de length 2 que é igual ao final da sting;

public class Last2 {
	public int last2 (String str) {
		int contador = 0;
		String silabaFinal = str.substring(str.length() - 2, str.length());
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 == str.length() || str.length() < 1) {
				break;
			}
			String local = str.substring(i, i + 2);
			if (local.equals(silabaFinal)) {
				contador++;
			}
		}
		
		return contador - 1;
	}
}

// funcional;