package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		Conta contaDoPaulo = em.find(Conta.class, 1L); // coloca a conta com id 1 em modo manager (mais infos no caderno do cruso de java e jpa.
		
		System.out.println("conta:" + contaDoPaulo.getTitular());
		
		em.getTransaction().begin();
		contaDoPaulo.setSaldo(20.0);
		em.getTransaction().commit();
	}	
}
