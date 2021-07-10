package br.paulo.exercicios.treino.Warmup2.modulo;

// Dada uma string retorne verdadeiro se a primeira instancia de 'x' for seguida diretamente de outro 'x';
// ex: xxaax == true ; xaaxxa = false;

public class DoubleX {
	public boolean doubleX(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			if (i + 1 == str.length()) {
//				return false;
//			}
//			if(str.charAt(i) == 'x') {
//				if(str.charAt(i + 1) == 'x') {
//					return true;
//				}
//				return false;
//			}
//		}
//		return false;
		
		int i = str.indexOf("x");
		if (i == -1) return false;
		
		String x = str.substring(i);
		return x.startsWith("xx");
	}
}


// FUncional;