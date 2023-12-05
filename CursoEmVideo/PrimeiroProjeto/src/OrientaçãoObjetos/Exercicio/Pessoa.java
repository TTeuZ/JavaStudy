package OrientaçãoObjetos.Exercicio;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    //metodos especiais

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

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

    // metodos

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
}
