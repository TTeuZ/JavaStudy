package OrientaçãoObjetos.Herança;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setCurso("BCC");
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("TES");

        b1.pagarMensalidade();
    }
}
