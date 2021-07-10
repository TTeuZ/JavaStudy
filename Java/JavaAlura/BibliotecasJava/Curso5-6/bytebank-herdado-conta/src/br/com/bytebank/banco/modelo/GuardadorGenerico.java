package br.com.bytebank.banco.modelo;

public class GuardadorGenerico {
	private Object[] objetos;
	private int posicao;
	
	public GuardadorGenerico() {
		this.objetos = new Object[10];
		this.posicao = 0;
	}
	
	public void adiciona(Object obj) {
		this.objetos[this.posicao] = obj;
		this.posicao++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicao;
	}
	
	public Object getReferencia(int i) {
		return this.objetos[i];
	}
}
