package br.paulo.exercicios.treino.Warmup1.modulo;

// verifica se a string comeca com *ix;

public class mixStart {
	public boolean mixStar(String str) {
		if (str.length() < 3) {
			return false;
		}
		return "ix".equals(str.subSequence(1,3));
	}
}

// funcional