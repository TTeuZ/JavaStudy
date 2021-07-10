package OrientaçãoObjetos.Exercicio;

public class App {
    public static void main(String[] args) {
        Livro livros[] = new Livro[5];

        Pessoa pessoas[] = new Pessoa[5];

        pessoas[0] = new Pessoa("Emanuel", "Helicoptero de combate", 21);

        livros[0] = new Livro("Teste1", "Testando", 380, pessoas[0]);

        System.out.println(livros[0].detalhes());
    }
}
