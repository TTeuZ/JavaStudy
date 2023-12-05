package br.paulo.exercicios.treino.Warmup2.modulo;

// dado uma string, suponhamos que essa strig tenha um y*k, retorne uma string sem todos o s y*k

public class StringYak {
	public String stringYak(String str) {
//		String strIteravel = str.toLowerCase();
//		String result = "";
//		
//		for (int i = 0; i < strIteravel.length() - 3; i++) {
//			if(strIteravel.charAt(i) == 'y' && strIteravel.charAt(i + 2) == 'k') {
////				if(i > 0) {
////					strIteravel = strIteravel.substring(0, i) + strIteravel.substring(i + 3);
////				}
//				strIteravel = strIteravel.substring(i + 3);
//			}
//			result = strIteravel;
//		}
//		
//		
//		return result;

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i = i + 2;
			} else {
				result = result + str.charAt(i);
			}
		}

		return result;
	}
}
