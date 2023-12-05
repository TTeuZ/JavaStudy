// é aqui que iremos colocar todas as partes do codigo que lidam com o banco de dados
// ou seja, funçoes que irao ter os entitymanager e todo as querys de acesso


package br.com.alura.jpa.modelo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.alura.jpa.modelo.Movimentacao;

public class MovimentacaoDao {
	private EntityManager em;
	
	public MovimentacaoDao(EntityManager em) { // necessario indicar o entityManager na instanciação da 
		this.em = em;
	}
	
//	public List<Movimentacao> getMovimentacoesFiltradasPorData(Integer dia, Integer mes, Integer ano) {
//		String sql = "select m from Movimentacao m";
//		
//		if (dia != null) {
//			sql = sql + "where day(m.data) = :pDia";
//		}
//		if (mes != null) {
//			sql = sql + "where month(m.data) = :pMes";
//		}
//		if (ano != null) {
//			sql = sql + "where year(m.data) = :pAno";
//		}
//		
//		return null;
//	}
	// isso é jogado fora pela dificuldade de tratar os dados em suas diversas exçoes de escrita.
	
	public List<Movimentacao> getMovimentacoesFiltradasPorData(Integer dia, Integer mes, Integer ano) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Movimentacao> query = builder.createQuery(Movimentacao.class);
		Root<Movimentacao> root = query.from(Movimentacao.class);
		
		List<Predicate> predicates = new ArrayList();
		
		if (dia != null) {
			// predicate significa que estamos afirmando que o que colocarmos é igual ao dia
			Predicate equal = builder.equal(builder.function("day", Integer.class, root.get("data")), dia);
			predicates.add(equal);
		}
		if (mes != null) {
			Predicate equal = builder.equal(builder.function("month", Integer.class, root.get("data")), mes);
			predicates.add(equal);
		}
		if (ano != null) {
			Predicate equal = builder.equal(builder.function("year", Integer.class, root.get("data")), ano);
			predicates.add(equal);
		}
		
		query.where((Predicate[]) predicates.toArray(new Predicate[0]));
		
		TypedQuery<Movimentacao> typedQuery = em.createQuery(query);
		
		return typedQuery.getResultList();
	}

	public List<Object[]> getMediaDiaria() {
//		String jpql = "select avg(m.valor), day(m.data), month(m.data) from Movimentacao m group by day(m.data), month(m.data), year(m.data)";
//		
//		Query query = em.createQuery(jpql);
		
		Query query = em.createNamedQuery("mediaDasMovimentacoes"); // para poder utilizar as named querys
		
		return query.getResultList();
	}
	
	public BigDecimal getSoma() { 
		String jpql = "select sum(m.valor) from Movimentacao m"; // faz a soma dos valores das movimentaçoes
		
		TypedQuery<BigDecimal> query = em.createQuery(jpql, BigDecimal.class); // quando tratamos de media é necessario usar o tipo DOUBLE
		return query.getSingleResult();
	}
}
