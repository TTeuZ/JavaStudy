package OrientaçãoObjetos.UEC;

import java.util.Random;

public class luta {
    // atributos
    private Combatente desafiante;
    private Combatente desafiado;
    private int rounds;
    private boolean aprovada;

    // metodos especiais

    public Combatente getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Combatente desafiante) {
        this.desafiante = desafiante;
    }

    public Combatente getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Combatente desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // metodos normais

    public void marcarLuta(Combatente l1, Combatente l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("#######DESAFIADO#######");
            System.out.println(" ");
            this.desafiado.apresentar();
            System.out.println("#######DESAFIANTE#######");
            System.out.println(" ");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch (vencedor) {
                case 0:
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                
                case 1:
                    System.out.println("Lutador " + this.desafiado.getNome() + " VENCEU!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println("Lutador " + this.desafiante.getNome() + " VENCEU!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }
    }
}
