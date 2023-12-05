package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * CRIADO NA AULA DO CURSO 7
 * 
 * 
 * @author tteuz
 *
 */


public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo");
		cliente.setProfissao("Dev");
		cliente.setCpf("2134123412");
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		cc.deposita(400.0);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}
}
