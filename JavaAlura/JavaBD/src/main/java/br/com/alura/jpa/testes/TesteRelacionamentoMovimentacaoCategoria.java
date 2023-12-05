package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Categoria;
import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.tipoMovimentacao;

public class TesteRelacionamentoMovimentacaoCategoria {
	public static void main(String[] args) {
		Categoria categoria = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negocios");
		
		Conta conta = new Conta();
		conta.setId(1L);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDescricao("viagem a sp");
		movimentacao.setTipoMovimentacao(tipoMovimentacao.SAIDA);
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setValor(new BigDecimal(200.0));
		movimentacao.setCategorias(Arrays.asList(categoria, categoria2));
		movimentacao.setConta(conta);
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setDescricao("viagem a rj");
		movimentacao2.setTipoMovimentacao(tipoMovimentacao.SAIDA);
		movimentacao2.setData(LocalDateTime.now());
		movimentacao2.setValor(new BigDecimal(400.0));
		movimentacao2.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(categoria);
		em.persist(categoria2);
		
		em.persist(movimentacao);
		em.persist(movimentacao2);
		
		em.getTransaction().commit();
		em.close();
	}
}
