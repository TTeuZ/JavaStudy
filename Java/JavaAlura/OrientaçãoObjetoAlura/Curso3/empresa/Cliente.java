package OrientaçãoObjetoAlura.Curso3.empresa;

public class Cliente implements Autenticavel {
    private AutenticacaoSenha autentica;

    // metodos especias
    public Cliente() {
        this.autentica = new AutenticacaoSenha(); // Para criar a instancia de autenticação na classe.
    }

    @Override
    public void setSenha(String senha) {
        this.autentica.setSenha(senha);  //Explicaçoes na classe do gerente.
    }
    @Override
    public boolean autenticacao(String senha) {
        return this.autentica.autenticacao(senha);
        
    }
}
