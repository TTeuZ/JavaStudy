package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Esse é o padrao Decorator, ou seja, uma classe decora a função de outra e acrescenta mais.
		
		// Fluxo de entrada com arquivo
		// arquivo lido em bit
		// entrada do arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // InputStream é a classe mais generia para entrada de dados
		// bits para caracteres
		Reader isr = new InputStreamReader(fis); // Reader é a classe mais generica de leitores.
		// caracteres para linha de strings
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
//		System.out.println(linha); aqui imprime uma linha só
		
		while(linha != null) { // para imprimir o arquivo de texto inteiro
			System.out.println(linha);
			linha = br.readLine();
		}
	
		br.close();  // fechar o reader, evita erros.
	}
}


// o FileInputStream apenas le o input em muito baixo nivel 'Bits' para isso temos a segunda classe InputStreamReader que consegue efetuar a leitura do input de maneira de mais alto nivel.
// no caso consegue ler os bits e transformalos em numeros de caracteres e retornar um int com esse numero de caracteres.

// o FileInputStream consegue apenas ler o aquivo em bits, e retorna um int com o numero de bits, ou seja, muito baixo nivel
// por isso é utilizado um segundo reader chamado InputStreamReader, que consegue ler o bits, transformalos em caracteres e retornar um int com o numero de caracteres, ainda baixo nivel.
// e por fim, é utilizado o BufferedReader que consegue juntar esse caracteres em linhas e retornar uma string com uma das linhas do arquivo, um tanto mais alto nivel.

// OBS: vale resaltar que todos esses retornos sao especificados por metodos das classes utilizadas e cada classe possui inumeros metodos que podem ser eficazes dependendo do caso.


// até o bt.readLine ele ira ler apenas uma unica linha, que no caso foi a primeira do documento.


// OBS2: Como o codigo lida com entrada e leitura de arquivos, podem existir erros e exeçoes, por isso é obrigatorio utilizar um try/catch ou expecificar que a classe pode jogar
// uma excessao, neste caso temos duas a FileNotFoundException para o FileInputStream, e a IOException, que é a Execeção mae (no caso a FileNotFoundException extende dela).

// As classes tipo 'Stream' focam na leitura de bytes, ou seja para arquivos pdfs e imagens.
// As classes tipo 'Reader' focam na leitura de caracteres, stream de caracteres, ou seja , melhor para arquivos de texto.


