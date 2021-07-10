package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteArquivoComInputNoTeclado {
	public static void main(String[] args) throws IOException {
		InputStream fis = System.in; // Esse system.in significa que ele vai captar a entrada que vai vir do teclado.
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("escrito.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) { // adicionado o s isEmpty pois caso nao tiver, torna-se impossivel sair do lopping do while.
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
}

// com esse codigo temos o exemplo da flexibilidade, pois apenas trocando o input ou o output podemos ter saidas e entradas das diversas fontes.
// trocando de system. in para o FileInputStream ja podemos enviar um aquivo e copiar
// trocando para um socket podemos receber informaçoes de rede.
// o mesmo vale para os outputs
// e isso tudo sem alterar o restante do codigo.