package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {
	public static void main(String[] args) {
		// conta em estado transient, ou seja, ela existe na memoria, possui informaçoes, mas nao tem id mas pode se tornar manager no futuro.
		Conta conta = new Conta();
		conta.setTitular("paula");
		conta.setAgencia(12341);
		conta.setNumero(3452);
		conta.setSaldo(400.0);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta); // agora a conta esta em manager
		em.remove(conta); // agora estamos removendo do banco ed dados, esse é o delete, ele ira retirar do banco de dados a conta.
		em.getTransaction().commit();
	}
}
