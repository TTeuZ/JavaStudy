package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaComSaldo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta(); // intancia normal de objeto
		
		conta.setTitular("jose");
		conta.setAgencia(4321);
		conta.setNumero(123456);
		conta.setSaldo(500.0);
		
		em.getTransaction().begin(); // para poder enviar dados para o bd temos obrigatoriamente que estar dentro de uma transação, e ela é iniciada aqui.
		em.persist(conta); // aqui estamos informando que estamos pegando os dados do objeto conta // coloca a conta com id 1 em modo manager (mais infos no caderno do cruso de java e jpa.
		em.getTransaction().commit(); // esse comando .commit() é o que envia os dados para o bd.
	}
}
