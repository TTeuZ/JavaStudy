package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Categoria;
import br.com.alura.jpa.modelo.Movimentacao;

public class TesteJPQLMovimentacaoDeUmaCategoria {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		Categoria categoria = new Categoria();
		categoria.setId(2L);
		
		String jpql = "select m from Movimentacao m join m.categorias c where c = :pCategoria"; // pedindo para selecionar de m que é uma movimentacao onde a conta for iqual ao parametro colocado a cima ordanado pelo valor em ordem decrescente
		
//		Query query = em.createQuery(jpql); // query normal, seu problema é que ela nao verifica o tipo da query, o que pode causar excessos no codigo;
		TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class); // query tipada, ou seja, ele especifica o tipo que vai ser da query, e necessario passar o .class como parametro para funcionar
		query.setParameter("pCategoria", categoria);
		List<Movimentacao> resultList = query.getResultList();
		
		for (Movimentacao movimentacao : resultList) {
			System.out.println("-----------------------------------------------");
			System.out.println("Categoria: " + movimentacao.getCategorias());
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Valor: "+ movimentacao.getValor());
			System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
			System.out.println("-----------------------------------------------");
		
		}
	}
}
