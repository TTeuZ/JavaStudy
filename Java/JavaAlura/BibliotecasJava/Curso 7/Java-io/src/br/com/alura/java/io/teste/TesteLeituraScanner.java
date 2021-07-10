package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv")); // utilizando o New file, o scanner ja ira conseguir ler todo o arquivo enviado.
		
		while(scanner.hasNextLine()) { // pergunta-se para o scanner se ele possui uma proxima linha
			String linha = scanner.nextLine(); // pega a proxima linha e armazena numa string
			System.out.println(linha); // printa a linha num console.
			
//			String[] valores = linha.split(","); separa a string pelas virgulas e armazenas essas string separadas em um array.
//			System.out.println(valores[3]); posso assesar cada valor separado usando o index.
			
			Scanner linhaScanner = new Scanner(linha); // criando outro scanner que recebe a 'linha' produzida pelo outro scanner
			linhaScanner.useLocale(Locale.US); // para usar as regras americanas.
			linhaScanner.useDelimiter(","); // fazendo o mesmo que o split.
			
			String tipoConta = linhaScanner.next(); // pega a primeira string
			int agencia = linhaScanner.nextInt(); // pega o proximo valor, no nosso caso é a agencia, entao é um int, OBS: pode usar o next apenas tbm, mas o retorno sera string e nao int.
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double salario = linhaScanner.nextDouble();
			System.out.printf(new Locale("pt", "BR"), "%s - %04d - %04d - %s - %08.2f \n", tipoConta, agencia, numero, titular, salario); // String formatada
			
			linhaScanner.close();
		}
		
		scanner.close();
	}
}


// Scanner é a classe mais alto nivel para a leitura de inputs
// torna-se desnecessario o uso dos inputStrem e etc.
// possui diversos metodos que facilitam a leitura.