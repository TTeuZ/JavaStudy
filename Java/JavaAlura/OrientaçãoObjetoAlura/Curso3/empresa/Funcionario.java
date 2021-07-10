package OrientaçãoObjetoAlura.Curso3.empresa;

// Funcionario virou uma classe abstrata, ou seja, nao é possivel instanciar objetos a parir da classe funcionario
// Porem todos as outras classes que herdam funcionario funcionam normalmente

public abstract class Funcionario {
    // atributos
    private String nome;
    private String cpf;
    private double salario;

    //metodos especiais

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
    }

    //metodos

    // Agora esse metodo é abstrato, como cada tipo de funcionario tem sua bonificação especifica, esse metodo nao precisa ser estanciado aqui.
    // por isso ele é colocado como abstrato, ele existe na classe, mas nao pode ser instanciado nela, e sim o filhos precisam estanciar essa classe.
    public abstract double getBonificao();
}
