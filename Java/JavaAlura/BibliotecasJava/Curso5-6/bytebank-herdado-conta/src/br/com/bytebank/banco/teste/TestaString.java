package br.com.bytebank.banco.teste;

public class TestaString {
	public static void main(String[] args) {
//		String nome = "Alura";  // objeto literal
		
//		nome.replace("A", "a"); // nao funciona pois uma String é imutavel
//		String outra = nome.replace("A", "a");
//		
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c, d);
		
//		char c = nome.charAt(2); // retona o caracter na posição 2
//		int a = nome.indexOf("ur");
//		String outra = nome.substring(1);
//		
//		int a = nome.length();
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		String vazio = " ";
		String outroVazio = vazio.trim(); // essa função retira os espaços vazios no inicio e no fim da string
		System.out.println(outroVazio.isEmpty());
		System.out.println(vazio.isEmpty()); // isEMpty verifica se a string esta vazia, espaços valem como preenchimento, ou seja, uma string com um espaço nao esta vazia

		System.out.println(outroVazio.contains(vazio)); // contains retorna se uma string possui outra, ou uma substring ou um char, etc.
		
//		System.out.println(nome);
//		System.out.println(a);
//		System.out.println(c);
//		System.out.println(outra);
	}
}


// string é um objeto, logo possui inumeras funçoes
// uma String instanciada NAO PODE SER ALTERADA