package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {	

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter writer = new FileWriter("EscritaFacilitada.txt"); // o fileWriter sozinho faz tudo o que os outros tres a cima fazem.
//		
//		writer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//		writer.write(System.lineSeparator()); // para pular linha uma seção mais baixo nivel
//		writer.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
//		
//		writer.close();
		
		// para podermos continuar utilizando o auto nivel oferecido pelo bufferedWrite podemos encapsular o fileWriter nele:
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("EscritaFileWriter.txt")); // recomendado.
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
		
		bw.close();
		
	}
}


