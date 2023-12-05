package br.paulo.exercicios.treino.Warmup1.modulo;

// dado dois valores, retorna o valor mais proximo de 10, e se der empate retorna zero.

public class Close10 {
	public int close10(int a, int b) {
		int primeiro = Math.abs(10 -a);
		int segundo = Math.abs(10 -b);
		
		if(primeiro == segundo) {
			return 0;
		} else if (primeiro > segundo) {
			return b;
		} else {
			return a;
		}
	}
}


// funcional