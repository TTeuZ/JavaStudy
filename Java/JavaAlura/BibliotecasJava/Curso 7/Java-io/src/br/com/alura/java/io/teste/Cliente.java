package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente do bytebank.
 * 
 * @author tteuz
 * @version 0.1
 */

public class Cliente implements Serializable {

	// esse atributo estatico serve para marcarmos as versoes da classe com o passar do tempo
	// sempre quando for serialiazar uma classe é uma boa pratica utilizar desse atributo
	// sempre que houver uma alteração estrutural do codigo, como por exemplo uma mudança nso atributos voce deve aumentar o serialID em 1, para informar que os objetos criados com o antigo id nao sao mais compativeis.
	// a alteração de metodos nao necesita ed mudança no serial.
	private static final long serialVersionUID = 1L;
	
	private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", profissao=" + profissao + "]";
	}

    
}
