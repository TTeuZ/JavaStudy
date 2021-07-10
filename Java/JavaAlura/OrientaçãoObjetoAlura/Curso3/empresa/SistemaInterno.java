package OrientaçãoObjetoAlura.Curso3.empresa;

public class SistemaInterno {
    // atributos
    private String senha = "2222";

    // Posso utilizar uma interface como paremtro, sendo assim, quando eu criar um gerente, por exemplo, ele é um autenticavel, entao o parametro é aceito
    public void autentica(Autenticavel g) {
        boolean autenticou = g.autenticacao(this.senha);
        if(autenticou) {
            System.out.println("entrou!");
        } else {
            System.out.println("nao entrou!");
        }
    }
}
