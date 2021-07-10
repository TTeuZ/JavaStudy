package br.paulo.exercicios.treino.Warmup1.modulo;

//da uma string, se ela tiver entre 1 e 3 caracteres 3 retorna true.

public class StringE {
	public boolean stringE(String str) {
		char[] charString = str.toLowerCase().toCharArray();
		
		int contador = 0;
		
		for (char c : charString) {
			if(c == 'e') {
				contador++;
			}
		}
		
		return contador >= 1 && contador <=3;
	}
}


// funcional