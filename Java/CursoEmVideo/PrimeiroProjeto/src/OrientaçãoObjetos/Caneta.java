package OrientaçãoObjetos;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String m, String c, float p, int ca) { //metodo construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setCarga(ca);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.modelo = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int c) {
        this.carga = c;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

    public void rabiscar() {
        if(!this.tampada) {
            System.out.println("Posso escrever!");
        } else {
            System.out.println("A caneta esta tampada =C");
        }
    }
}