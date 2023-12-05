package OrientaçãoObjetoAlura.Curso3.empresa;

public class App {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("jose", "3217749123", 10000);
        g1.setSenha("2222");

        System.out.println("===============================");
        System.out.println(g1.toString());
        System.out.println(g1.getBonificao());

        ControlaBonificacao c1 = new ControlaBonificacao();

        c1.registra(g1);

        System.out.println(ControlaBonificacao.getSoma());


        SistemaInterno s1 = new SistemaInterno();

        s1.autentica(g1);
    }
}
