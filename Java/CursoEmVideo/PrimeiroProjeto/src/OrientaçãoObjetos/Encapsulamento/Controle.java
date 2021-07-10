package OrientaçãoObjetos.Encapsulamento;

public class Controle implements Interface {
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metedos especiais
    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int v) {
        this.volume = this.volume + v;
    }

    private boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(boolean b) {
        this.ligado = b;
    }

    private boolean getTocando() {
        return this.tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }

    // metodos abstrados

    @Override
    public void ligarDesligar() {
        if(this.getLigado()) {
            this.setLigado(false);
        } else {
            this.setLigado(true);
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume()+10);
        } else {
            System.out.println("Nao é possivel aumentar o volume quando esta desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume()-10);
        } else {
            System.out.println("Nao é possivel diminuir o volume quando esta desligado!");
        }
    }

    @Override
    public void ligarDesligarMudo() {
        if(this.getVolume() > 0 && this.getLigado()) {
            this.setVolume(0);
        } else {
            this.setVolume(50);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado: " + this.getLigado());
        System.out.println("Está tocando: " + this.getTocando());
        System.out.print("Volume: ");
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        } else if (!this.getLigado()) {
            System.out.println("Nao é possivel tocar desligado!");
        } else {
            System.out.println("Ja esta tocando!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else if(!this.getLigado()) {
            System.out.println("Nao é possivel pausar desligado!");
        } else {
            System.out.println("Já esta pausado!");
        }
    }
}
