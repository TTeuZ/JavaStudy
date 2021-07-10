package OrientaçãoObjetos.Exercicios2;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    // metodos especiais

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMiasUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // metodos

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcent) {
        int total = 0;

        if (porcent <= 20) {
            total = 2;
        } else if (porcent <= 50) {
            total = 5;
        } else if (porcent <= 80) {
            total = 8;
        } else {
            total = 10;
        }

        this.filme.setAvaliacao(total);
    }
    
}
