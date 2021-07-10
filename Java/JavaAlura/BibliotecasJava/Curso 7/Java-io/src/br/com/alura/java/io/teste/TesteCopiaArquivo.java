package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaArquivo {
	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("loremCopiado.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine(); // cria a primeira linha
		
		while(linha != null) { // enquanto nao estiver vazia
			bw.write(linha); // escreve no documento novo a linha atual
			bw.newLine(); // pula uma linha para baixo 
			linha = br.readLine(); // escreve em 'linha' a proxima linha do documento
		}
		
		br.close();
		bw.close();
	}
}