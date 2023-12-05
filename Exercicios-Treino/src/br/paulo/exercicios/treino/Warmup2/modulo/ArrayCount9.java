package br.paulo.exercicios.treino.Warmup2.modulo;

// Dado um array retorne o numero de vezes que o numero 9 aparece.

public class ArrayCount9 {
	public int arraycount(int[] nums) {
		int result = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				result++;
			}
		}
		
		return result;
	}
}

// funcional
