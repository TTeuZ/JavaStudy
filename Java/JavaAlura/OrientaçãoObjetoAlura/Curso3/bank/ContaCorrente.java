package OrientaçãoObjetoAlura.Curso3.bank;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.1;
    }
}
