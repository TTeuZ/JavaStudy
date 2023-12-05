package br.paulo.exercicios.treino.Warmup1.modulo;

// o parametro hora é o hoario do dia entre 0 e 23
// o parametro talking e se o papagaio esta falando ou nao
// estamos em problema se o papagaio esta falando e for antes das 7 ou depois das 20 hrs.

public class parrotTrouble {
	public boolean parrottrouble(boolean talking, int hour) {
//		if (talking) {
//			if (hour < 7 || hour > 20) {
//				return true;
//			}
//			return false;
//		}
//		
//		return false;
		
		return (talking && (hour < 7 || hour > 20)); // modo encurtado.
	}
}

// funcional.