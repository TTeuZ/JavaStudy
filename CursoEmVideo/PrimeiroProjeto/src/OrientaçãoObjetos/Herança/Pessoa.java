package OrientaçãoObjetos.Herança;

// CLASSE MAE / SUPERCLASSE / PROGENITORA / PAI

public abstract class Pessoa {
    private String nome, sexo;
    private int idade;

    //metodos especiais

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
    // metodos

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
}
