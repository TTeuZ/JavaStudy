package br.paulo.exercicios.treino.Warmup1.modulo;

// verifica se entre os 3 numeros informados existe um adolescente, idade entre 13 a 19.

public class HasTeen {
	public boolean hasTeen(int a, int b, int c) {
//		if(13 < a || 13 < b || 13 < c) {
//			if(a < 19 || b < 19 || c < 19) {
//				return true;
//			}
//			return false;
//		}
//		
//		return false; possui algumas falhas
		
		return (a >= 13 && a<=19) || (b >= 13 && b<=19) || (c >= 13 && c<=19); // funcional
	}
}

