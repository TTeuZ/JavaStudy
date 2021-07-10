package OrientaçãoObjetos.Exercicio;

public class Livro implements ILivro {

    // atributos

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // metodos abstratos

    public String detalhes() {
        return "Livro [aberto=" + aberto + ", autor=" + autor + ", leitor=" + leitor.getNome() + ", pagAtual=" + pagAtual
                + ", titulo=" + titulo + ", totPaginas=" + totPaginas + "]";
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(0);
        }else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avacarPag() {
        if (this.getPagAtual() == this.getTotPaginas()) {
            System.out.println("Voce ja esta no final!");
        } else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag(){
        if ( this.getPagAtual() == 0) {
            System.out.println("Voce ja esta na primeira pagina!");
        } else {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }

    // metodos especias

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // metodo construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa dono) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = dono;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual= 0;
    }
}
