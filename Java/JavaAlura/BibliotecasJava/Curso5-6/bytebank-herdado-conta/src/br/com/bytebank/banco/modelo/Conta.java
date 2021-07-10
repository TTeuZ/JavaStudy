package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a estrutura de uma conta
 * 
 * @author tteuz
 *
 */


public abstract class Conta implements Comparable<Conta>, Serializable {  // essa conta pode ser comparada com outra conta

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    
    /**
     * Contrutor para iniciar um objeto com agencia e numero
     * 
     * 
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;       
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    
    //adicionado no curso 6
    @Override
    public boolean equals(Object ref) {
    	Conta outra = (Conta) ref;
    	if (this.agencia != outra.agencia) {
    		return false;
    	}
    	
    	if (this.numero != outra.numero) {
    		return false;
    	}
    	
    	return true;
    }
    
    @Override
    public int compareTo(Conta outra) { // definimos a ordem natural dessa classe com uma comparação de saldos.
    	return Double.compare(this.saldo, outra.saldo);
    }

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
	}
}