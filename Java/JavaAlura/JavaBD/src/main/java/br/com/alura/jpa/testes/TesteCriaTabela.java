//package br.com.alura.jpa.testes;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class TesteCriaTabela {
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o entitymanagerfactory procurando uma persistence com o nome contas para criar a factory
//		EntityManager createEntityManager = emf.createEntityManager(); // aqui temos um entitymanager sendo criado a partir da factory criada a cima
//		emf.close(); // aqui fechamos a factory
//	}
//}
