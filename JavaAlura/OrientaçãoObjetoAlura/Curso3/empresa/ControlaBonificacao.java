package OrientaçãoObjetoAlura.Curso3.empresa;

public class ControlaBonificacao {
    private static double soma;

    // SEMPRE IRA CHAMAR O METODO ESPECIFICO DA CLASSE, SE EU INDICAR UM GERENTE NESSA FUNÇÃO, ELE IRA CHAMAR O METODO DE BONIFICACAO DO GERENTE.
    public void registra(Funcionario f1) {
        soma = soma + f1.getBonificao();
    }

    public static double getSoma() {
        return ControlaBonificacao.soma;
    }
}
