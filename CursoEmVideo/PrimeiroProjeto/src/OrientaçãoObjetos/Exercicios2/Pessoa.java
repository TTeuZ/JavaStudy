package OrientaçãoObjetos.Exercicios2;

public abstract class Pessoa {
    protected String nome, genero;
    protected int idade, exp;

    // metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.exp = 0;
    }

    // metodos

    public void ganharExp() {
        this.setExp(this.getExp() + 50);
    }
}
