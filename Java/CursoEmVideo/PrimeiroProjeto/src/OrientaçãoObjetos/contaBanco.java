package OrientaçãoObjetos;

public class contaBanco {
    public int nunConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public contaBanco(int nunConta, String dono, String tipo) {
        this.nunConta = nunConta;
        this.dono = dono;
        this.abrirConta(tipo);
    }

    public void abrirConta(String tipo) {
        this.status = true;
        if(tipo.equals("cp")) {
            this.saldo = 150f;
        } else {
            this.saldo = 50f;
        }
    }

    public void fecharConta() {
        if(this.saldo != 0f){
            System.out.println("Nao é possivel fechar a conta pois ela possui saldo ou debito");
        }else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float deposito) {
        if(!this.status) {
            System.out.println("Não é possivel depositar em uma conta fechada");
        } else {
            this.saldo = this.saldo + deposito;
            System.out.println("Seu saldo em conta agora é: " + this.saldo);
        }
    }

    public void sacar(float sacado) {
        if(!this.status) {
            System.out.println("Não é possivel sacar valores de uma conta fechada!");
        } else {
            if(sacado > this.saldo) {
                System.out.println("Nao é possivel sacar um valor maior do existente em conta");
            } else {
                this.saldo = this.saldo - sacado;
                System.out.println("Seu sando em conta agora é: " + this.saldo);
            }
        }
    }

    public void pagarMensal() {
        float v;
        if (this.tipo.equals("cc")) {
            v = 12f;
        } else {
            v = 20f;
        }
        if(!this.status) {
            System.out.println("Conta está fechada");
        } else {
            this.saldo = this.saldo - v;
            System.out.println("O seu saldo apos pagamanto da tarifa é: " + this.saldo);
        }
    }

    public void sobre() {
        System.out.println("Sobre a conte de " + this.dono + ":");
        if(!this.status) {
            System.out.println("Conta fechada");
        } else {
            System.out.println("Conta aberta");
        }
        System.out.println("Saldo: " + this.saldo);
    }

    public int getNumConta() {
        return this.nunConta;
    }
    public void setNumConta(int cConta) {
        this.nunConta = cConta;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}