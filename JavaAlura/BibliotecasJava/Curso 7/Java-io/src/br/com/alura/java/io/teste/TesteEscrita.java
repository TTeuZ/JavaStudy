package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteEscrita {

	public static void main(String[] args) throws IOException {	

		OutputStream fos = new FileOutputStream("lorem2.txt"); // loream2.txt é o nome do arquivo que vai ser gerado
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");  // escreve uma string no arquivo. OBS: é sobrecarregado, podem se utilizar outros parametros.
		bw.newLine();
		bw.newLine(); // crias linhas vazias.
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
		
		bw.close();  // fechar o reader, evita erros.
	}
}

// para a saida de dados, a excencia é a mesma, para o inputStream temos o analogo OutputStream
// para o Reader temos o analogo Writer e assim por diante
// a exencia do padrao decorater continua a mesma.


