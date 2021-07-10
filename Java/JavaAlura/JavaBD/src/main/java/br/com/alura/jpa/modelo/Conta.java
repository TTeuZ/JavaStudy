package br.com.alura.jpa.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // isso é necessario para informar par ao entitymanagem que queremos criar uma tabela desse objeto
public class Conta {
	 @Id // para criar os identificadores.
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer agencia;
	private Integer numero;
	private String titular;
	private Double saldo; // adicionado pós criação da tabela
	
//	@OneToMany(mappedBy = "conta") // isso é feito para tornar o relacionamento conta_movimentacao em bidirecional, sem criar duas relaçoes diferentes
	// relacionamento em modo Lazyness/Lazy Loading
	
	@OneToMany(mappedBy = "conta", fetch = FetchType.EAGER) // relacionamento em modo eager, ou seja, carregara junto
	private List<Movimentacao> movimentacoes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	
	
}
