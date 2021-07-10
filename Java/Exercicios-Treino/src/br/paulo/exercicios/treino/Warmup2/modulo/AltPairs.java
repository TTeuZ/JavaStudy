package br.paulo.exercicios.treino.Warmup2.modulo;

// dado uma string, retorne outra resultande dos caracteres no sindexes 0,1,4,5,8,9...
// soma 1 depois soma 3
// par soma 1 impar soma 3

public class AltPairs {
	public String altPairs(String str) {
//		int index = 0;
//		int contador = 0;
//		String stringFinal = "";
//		
//		while (index < str.length()) {
//			stringFinal = stringFinal + str.charAt(index);
//			if (contador == 0 || contador % 2 == 0) {
//				index++;
//			}else {
//				index += 3;
//			}
//			contador++;
//		}
//		
//		return stringFinal; meu metodo
		
		String result = ""; // metodo do cara, nao entendi.
		  
		  // Run i by 4 to hit 0, 4, 8, ...
		  for (int i=0; i<str.length(); i += 4) {
		    // Append the chars between i and i+2
		    int end = i + 2;
		    if (end > str.length()) {
		      end = str.length();
		    }
		    result = result + str.substring(i, end);
		  }
		  
		  return result;
	}
}

// funcional;