package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta(); // intancia normal de objeto
		
		conta.setTitular("jose");
		conta.setAgencia(1234);
		conta.setNumero(32214);
		
		em.getTransaction().begin(); // para poder enviar dados para o bd temos obrigatoriamente que estar dentro de uma transação, e ela é iniciada aqui.
		em.persist(conta); // aqui estamos informando que estamos pegando os dados do objeto conta // coloca a conta com id 1 em modo manager (mais infos no caderno do cruso de java e jpa.
		conta.setSaldo(300.0);
		em.getTransaction().commit(); // esse comando .commit() é o que envia os dados para o bd.
		
		em.close();
		
		conta.setSaldo(200.0); // isso nao sera enviado, pois agora a conta esta em modo detach, para traze-la de volta sem retirar o close, é necessario intancias outra entitymaneger, e realizar um merge
		
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();
		em2.merge(conta);
		em2.getTransaction().commit();
	}
}
