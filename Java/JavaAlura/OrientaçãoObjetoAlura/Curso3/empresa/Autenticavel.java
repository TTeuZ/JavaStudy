package OrientaçãoObjetoAlura.Curso3.empresa;

// Para solucionar o problema do cliente poder acessar o sistema interno sem ser um funcionario
// foi transformada a classe autenticavel para uma interface
// desta maneira o cliente consegue utilziar essa interface e pode acessar o sistema interno sem ser funcionario
// e o gerente e administradores tbm podem acessar o sistema interno sendo funcionarios
// isso pois no java nao existe herança multipla.

public interface Autenticavel {
    public abstract void setSenha(String senha);
    public abstract boolean autenticacao(String senha);
}
