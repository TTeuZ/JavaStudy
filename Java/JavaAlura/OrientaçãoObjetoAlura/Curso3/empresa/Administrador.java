package OrientaçãoObjetoAlura.Curso3.empresa;

public class Administrador extends Funcionario implements Autenticavel{
    private AutenticacaoSenha autentica;

    //metodos especiais

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
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

    //metodos

    @Override
    public double getBonificao() {
        return 500;
    }
    
}
