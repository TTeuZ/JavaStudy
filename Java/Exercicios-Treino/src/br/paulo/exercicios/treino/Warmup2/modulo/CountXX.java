package br.paulo.exercicios.treino.Warmup2.modulo;

// dado uma string conte o numero de xx contidos nela
// ex = 'xx' = 1
// 'xxx' = 2

public class CountXX {
	public int contXX(String str) {
		str = str.toLowerCase();
		int result = 0;
		
		for(int i = 0; i < (str.length() - 1); i++) {
			if(str.substring(i, i + 2).equals("xx")) result++;
		}
		
		return result;
	}
}

// funcioanl;