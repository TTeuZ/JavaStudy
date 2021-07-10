package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaMediaDiariaDasMovimentacoes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas"); // aqui temos o mesmo processo no testecriatabela (aparentemente vai ter que ser repetido sempre)
		EntityManager em = emf.createEntityManager();
//		
//		String jpql = "select avg(m.valor), day(m.data), month(m.data) from Movimentacao m group by day(m.data), month(m.data), year(m.data)";
//		
//		Query query = em.createQuery(jpql);
//		List<Object[]> mediaDasMovimentacoes = query.getResultList();
		
		List<Object[]> mediaDasMovimentacoes = new MovimentacaoDao(em).getMediaDiaria();
//		
		for (Object[] resultado : mediaDasMovimentacoes) {
			System.out.println("A media das movimentaçoes do dia " + resultado[1] + "/" + resultado[2] + " é: " + resultado[0]);
		}
	}
}


// estamos fazendo um select orientado a object, cada valor em sequencia recebera seu identificador no array.
// depois disso estamos chamando na query o select que queremos
// criamos uma lista de objetos em arrays com o nome mediaDasMovimentacoes que recebe a lista de resultado da query
// depois criamos um foreach do objeto resultado para cada objeto do mediaDasMovimentacoes
// apartir disso podemos acesar os valores
// resultado[0] == avg(m.valor)
// resultado[1] == day(m.data)
// resultado[2] == month(m.data)

// proposito do group by nao entendido, pesquisar.