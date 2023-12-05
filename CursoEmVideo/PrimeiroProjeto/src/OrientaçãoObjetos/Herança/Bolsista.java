// bolsista é subclasse de aluno e tbm descentende de Pessoa, possui todas as carecteristicas das duas classes
// neste momento, por nao possuir subclasses, a classe Bolsista é uma 'folha' da arvore de especificação dos objetos

package OrientaçãoObjetos.Herança;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolda() {
        System.out.println("Renovando a bolda de " + this.getNome());
    }

    @Override  // polimorfismo de sobreposição;
    public void pagarMensalidade() { // este metodo existe na classe aluno, porem como ele esta sendo chamado aqui novamente, ele sobscreve o que o metodo daquela classe efetivamente faz
        System.out.println(this.getNome() + "É bolsista, mensalidade gratuita");
    }
}
