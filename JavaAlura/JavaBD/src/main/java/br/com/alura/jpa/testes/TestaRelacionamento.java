package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.tipoMovimentacao;

public class TestaRelacionamento {
	public static void main(String[] args) {
		Movimentacao movimentacao = new Movimentacao();
		
		Conta conta = new Conta();
		
		conta.setAgencia(12312);
		conta.setNumero(342342);
		conta.setSaldo(200.0);
		conta.setTitular("isabela");
		
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("churrasco");
		movimentacao.setValor(new BigDecimal(200.0));
		movimentacao.setTipoMovimentacao(tipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.persist(movimentacao);
		em.getTransaction().commit();
		
		em.close();
	}
}
