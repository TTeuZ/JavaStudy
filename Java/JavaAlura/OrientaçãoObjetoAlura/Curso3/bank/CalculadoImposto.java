package OrientaçãoObjetoAlura.Curso3.bank;

public class CalculadoImposto {
    private double totalImposto;

    public void registra (Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
    
}
