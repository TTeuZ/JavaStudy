package br.paulo.exercicios.treino.Warmup1.modulo;

// envia um caracter e um int, e tem que devolver a string com o caracter do int enviado retirado.

public class missingChar {
	public String misChar(String str, int i) {
		if (i > str.length()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		String retorno = str.replace(str.charAt(i), ' ');
		retorno = retorno.split(" ")[0] + retorno.split(" ")[1];
		
		return retorno;
		
	}
}


// funcional