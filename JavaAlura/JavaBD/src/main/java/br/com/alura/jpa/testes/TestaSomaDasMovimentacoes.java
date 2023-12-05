package br.com.alura.jpa.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaSomaDasMovimentacoes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
//		
////		String jpql = "select sum(m.valor) from Movimentacao m"; // faz a soma dos valores das movimentaçoes
//		String jpql = "select avg(m.valor) from Movimentacao m"; // faz a media dos valores das movimentaçoes
//		
////		TypedQuery<BigDecimal> query = em.createQuery(jpql, BigDecimal.class);
////		BigDecimal somaDasMovimentacoes = query.getSingleResult();
//		
//		TypedQuery<Double> query = em.createQuery(jpql, Double.class); // quando tratamos de media é necessario usar o tipo DOUBLE
//		Double mediaDasMovimentacoes = query.getSingleResult();
		
//		MovimentacaoDao dao = new MovimentacaoDao(em);
		
		// inicio da utilização do criteria
		
		CriteriaBuilder builder = em.getCriteriaBuilder(); // criando o builder
		CriteriaQuery<BigDecimal> query = builder.createQuery(BigDecimal.class); // instanciando um query tipado
		
		Root<Movimentacao> root = query.from(Movimentacao.class); // criando o root da query === from *
		
		// = sum(valor)
		Expression<BigDecimal> sum = builder.sum(root.<BigDecimal>get("valor"));
		
		query.select(sum);
		
		TypedQuery<BigDecimal> typedQuery = em.createQuery(query);
		
		System.out.println("media: " + typedQuery.getSingleResult());
	}
}
