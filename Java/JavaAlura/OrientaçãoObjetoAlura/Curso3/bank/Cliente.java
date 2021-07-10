package OrientaçãoObjetoAlura.Curso3.bank;

public class Cliente {
    private String nome, cpf, profissao;

    // metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", nome=" + nome + ", profissao=" + profissao + "]";
    }
}