// EXEMPLO DE HERANÇA PARA EXCLUSAO
// A CLASSE ALUNO TEM SUAS PROPIAS PROPIEDADES DE METODOS ALEM DOS VINDOS DA SUPERCLASSE

package OrientaçãoObjetos.Herança;

//CLASSE FILHA

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    // metodos especiais

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + "]";
    }

    // metodos abstratod

    public final void cancelarMatricula() { // o 'final' indica que esta é a ultima 'versao' do metodo, sendo assim, ele nao pode ser sobescrito pelas classes filhas
        System.out.println("A matricula sera cancelada!");
    }

    public void pagarMensalidade() {
        System.out.println("Paga a mensalidade!");
    }
}


// OBS: final pode ser colodado em classes tbm, e fazendo assim eles se tornam obrigatoriamente folhas, ou seja, nao pode ter subclasses.