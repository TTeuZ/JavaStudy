package OrientaçãoObjetos.UEC;

public class Combatente implements IConbatente {
    // atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    // metodos abstratos
    @Override
    public void apresentar() {
        System.out.printf("-------------------------------- %s ------------------------------- \n", this.getNome());
        System.out.println("Idade: " + this.getIdade() + "anos");
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("peso: " + this.getPeso());
        System.out.println("Categoria: " + this.categoria);
    }

    @Override
    public void status() {
        System.out.printf("-------------------------------- %s ------------------------------- \n", this.getNome());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // metodos especias;
    public Combatente(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return this.nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private float getAltura() {
        return this.altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return this.peso;
    }
    public String getCategoria() {
        return this.categoria;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        if(peso <= 52.2) {
            this.categoria = "INVALIDO";
        } else if (peso <= 70.3) {
            this.categoria = "LEVE";
        } else if (peso <= 83.9) {
            this.categoria = "MEDIO";
        } else {
            this.categoria = "PESADO";
        }
    }

    private int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return this.derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return this.empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
