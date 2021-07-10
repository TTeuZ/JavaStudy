package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserealizacao {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente ccRead= (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(ccRead);
	}
}
