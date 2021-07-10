package br.paulo.exercicios.treino.Warmup2.modulo;

// dado uma string retorne outra pegando um caracter e pulando  proximo
// ex: hello = hlo;

public class StringBits {
	public String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
