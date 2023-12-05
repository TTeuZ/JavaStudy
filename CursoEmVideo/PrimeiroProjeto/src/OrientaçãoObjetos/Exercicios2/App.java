package OrientaçãoObjetos.Exercicios2;

public class App {
    public static void main(String[] args) {
        Video v[] = new Video[2];

        v[0] = new Video("Teste");
        v[1] = new Video("Teste 2");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("jose", "masculino", 19, "seuZe");
        g[1] = new Gafanhoto("roberta", "Maquina de combate", 17 , "roMDC");

        Visualizacao vis = new Visualizacao(g[1], v[0]);
    }
}
