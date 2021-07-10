package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaMovimentacoesFiltradasPorClasse {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDao movimentacaoDao = new MovimentacaoDao(em);
		
		List<Movimentacao> movimentacoesFiltraadsPorData = movimentacaoDao.getMovimentacoesFiltradasPorData(null, null, 2020);
		
		for (Movimentacao movimentacao : movimentacoesFiltraadsPorData) {
			System.out.println("Descrição -> " + movimentacao.getDescricao());
			System.out.println("Valor -> " + movimentacao.getValor());
			System.out.println("-------------------------------------------");
		}
	}
}
