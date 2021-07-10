package br.paulo.exercicios.treino.Warmup1.modulo;

// temos 2 macacos, os parametros aSmile e bSmile indicam se eles estao sorrindo, temo sum problema se ambos estiverem sorrindo ou nenhum
// retorne true se estivermos em problemas.

public class MonkeyTrouble {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile || !aSmile && !bSmile) {
			return true;
		}
		
		return false;
	}
}


// funcional;