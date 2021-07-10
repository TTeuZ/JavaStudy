package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		String nome = "Paulo";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin")); // criando uma saida de bytes que vai ser gravada num arquivo de saida chamado objeto.bin
//		oos.writeObject(nome); // escrevendo nesse objeto a string nome
//		oos.close(); // fechando
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Object obj = ois.readObject();
		
		System.out.println(obj);
		
		ois.close();
	}
}
