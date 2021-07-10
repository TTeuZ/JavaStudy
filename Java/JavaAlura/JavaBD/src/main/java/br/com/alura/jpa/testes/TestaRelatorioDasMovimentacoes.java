package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Conta;

public class TestaRelatorioDasMovimentacoes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select distinct c from Conta c left join fetch c.movimentacoes";
		// join fetch foi adicionado posteriormente para solucionar o problema do (N + 1)
		// o left foi adicionado que é para buscar todos os itens da esquerda mesmo se nao estiverem com relação com os da direita
		// distinct é adicionado para evitar a repetição do mesmo item por causa do uso do left.
		TypedQuery<Conta> query = em.createQuery(jpql, Conta.class);
		
		List<Conta> contas = query.getResultList();
		for (Conta conta : contas) {
			System.out.println("------------------------------------------");
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Agencia: " +  conta.getAgencia());
			System.out.println("Numero: " + conta.getNumero());
//			System.out.println("Movimentações: " + conta.getMovimentacoes()); // percebe-se que dessa maneira, a query so carrega as movimentaçoes quando ela é chamada
			// isso acontece por causa do lazyloading, ou seja, sao carregados prequissosamentes, o seja, apenas quando chamados.
			System.out.println("Movimentações: " + conta.getMovimentacoes()); // implementado apos a utilização do featch EAGER
			System.out.println("------------------------------------------");
		}
	}
}
