// Sistema de relação de composição
// Gerente, administrador e cliente tem um autenticacaoSenha.

package OrientaçãoObjetoAlura.Curso3.empresa;

public class AutenticacaoSenha {
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticacao(String senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
