package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {	
//		BufferedWriter bw = new BufferedWriter(new FileWriter("EscritaFileWriter.txt"));
		
		PrintStream ps = new PrintStream("LoremPrintStream.txt"); // maneira mais alto nivel.
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		ps.close();
	}
}


// PrintStream pode ser substituido pro PrintWriter, o efeito e as funçoes sao as mesmas.
// essa é a maneira mais alto nivel e simplificada de escrever num arquivo, retirando todo o processo de criação dos inputStrens e etc.