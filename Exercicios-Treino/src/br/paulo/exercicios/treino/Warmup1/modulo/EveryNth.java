package br.paulo.exercicios.treino.Warmup1.modulo;

// dado uma string e um numero, retorne a string começado do zero e com os caracteres somados pulando de n em n
// ou seja se n for tres, pegas os caracteres 0,3,6,9...

public class EveryNth {
	public String everyNth(String str, int n) {
		int contador = 0;
		String stringFinal = "";
		
		if(n <= 0) {
			return "Impossivel";
		}
		
		while(contador < str.length()) {
			Character caracter = str.charAt(contador);
			
			stringFinal = stringFinal.concat(caracter.toString());
			
			contador += n;
		}
		
		return stringFinal;
	}
}


// funcional