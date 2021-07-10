package OrientaçãoObjetos.Exercicios2;

public class Gafanhoto extends Pessoa {
    private String login;
    private int toAssistido;

    // metodos especiais

    public Gafanhoto(String nome, String genero, int idade, String login) {
        super(nome, genero, idade);
        this.login = login;
        this.toAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getToAssistido() {
        return toAssistido;
    }

    public void setToAssistido(int toAssistido) {
        this.toAssistido = toAssistido;
    }
    

    // metodos

    public void viuMiasUm() {
        this.setToAssistido(this.getToAssistido() + 1);
    }
}
