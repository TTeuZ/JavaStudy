package br.paulo.exercicios.treino.Warmup2.modulo;

// dado um array de numeros, dizemos que um tripo é se um numero aparece em seguencia 3 vezes, retorne true se nao houver triples;

public class NoTriples {
	public boolean noTriples(int[] nums) {
//		int contador = 0;
//		boolean continua = true;
//		
//		while (continua) {	
//			int numero = nums[contador];
//			if(contador + 2 < nums.length) {
//				continua = false;
//				return true;
//			} else {
//				if (numero == nums[contador++] && numero == nums[contador + 2]) {
//					continua = false;
//					return false;
//				}
//			}
//			contador++;
//		}
//		
//		return false;
		
		// muito parecido com o que eu fiz, tirando o fato de iterar no array de maneira errada e caindo sempre no ArrayOutOfBoundException, por esse motivo tem que ussar o lenth -2
		
		// Iterate < length-2, so can use i+1 and i+2 in the loop.
		  // Return false immediately if every seeing a triple.
		  for (int i=0; i < (nums.length-2); i++) {
		    int first = nums[i];
		    if (nums[i+1]==first && nums[i+2]==first) return false;
		  }
		  
		  // If we get here ... no triples.
		  return true;
	}
}
