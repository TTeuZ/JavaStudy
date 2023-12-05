package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable // indica que o preço esta dentro do produto
public class Preco {
	private BigDecimal valor;
	private tipoPreco tipo;
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public tipoPreco getTipo() {
		return tipo;
	}
	public void setTipo(tipoPreco tipo) {
		this.tipo = tipo;
	}
}
