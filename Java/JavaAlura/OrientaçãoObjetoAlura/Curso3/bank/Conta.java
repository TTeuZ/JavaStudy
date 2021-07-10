package OrientaçãoObjetoAlura.Curso3.bank;

public abstract class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    //metodos especiais

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.total++;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
    }


    // Metodos

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta c2) throws SaldoInsuficienteException {
        this.sacar(valor);
        c2.deposita(valor);
    }
}