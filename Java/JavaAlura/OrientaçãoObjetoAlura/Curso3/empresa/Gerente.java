package OrientaçãoObjetoAlura.Curso3.empresa;

public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoSenha autentica;  //Para fazer os processos de login

    // metodos especiais

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autentica = new AutenticacaoSenha(); // Para criar a instancia de autenticação na classe.
    }

    @Override
    public void setSenha(String senha) {
        this.autentica.setSenha(senha);  // antigamente esse codigo dou 'autentica.getSenha()' estava em todas as classes que utilizam senha, e com isso, concentramos essa parte em uma unica classe responsavel por isso.
    }
    @Override

    public boolean autenticacao(String senha) {
        return this.autentica.autenticacao(senha);  // mesmo que o do SetSenha.
    }

    // metodos
    
    @Override
    public double getBonificao() {
        return  super.getSalario();
    }
}
