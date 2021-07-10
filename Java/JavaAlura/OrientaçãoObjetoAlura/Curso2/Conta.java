package OrientaçãoObjetoAlura.Curso2;

public class Conta{
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

    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public boolean transfere(double valor, Conta c2) {
        if (valor > this.saldo) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            c2.saldo = this.saldo + valor;
            return true;
        }
    }
}