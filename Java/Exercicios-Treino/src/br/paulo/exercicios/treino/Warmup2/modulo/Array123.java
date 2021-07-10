package br.paulo.exercicios.treino.Warmup2.modulo;

// dado um array de ints, retorne true se a seguencia 123 aparecer em alguma parte

public class Array123 {
	public boolean array123(int[] nums) {
//		int length = nums.length;
//		
//		for (int i = 0; i < length; i++) {
//			if (nums[i] == 1) {
//				if (nums[i + 1] == 2) {
//					if (nums[i + 2] == 3) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
		
		for (int i = 0; i < (nums.length); i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
		}
		return false;
	}
}

// funcional;
