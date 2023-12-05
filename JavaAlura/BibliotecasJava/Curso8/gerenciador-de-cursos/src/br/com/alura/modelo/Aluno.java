package br.com.alura.modelo;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	
	public String getNome() {
		return nome;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}

	
	@Override // gerado pela IDE
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatricula;
		return result;
	}

}

// HashCOde é o numero magico que os Sets usam para identificar os itens que estao na coleção
// ou seja, cada elemento possui o seu, é a 'seção' da coleção aonde esse item vai esta
// sempre que o metodo equals for reescrito quando se utiliza um set, o metodo hashCOde tbm tem que ser reescrito.

// nos podemos criar o nosso propio sistema de hascode, mas caso seja utilizado strings, elas ja possuem um emtodo hashCode muito eficaz, que soma todas os caracteres da string
// e retorna o numero dessa soma, fazendo com que cada string seja realmente unica

