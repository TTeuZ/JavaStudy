package Excessoes;

public class TesteComExecaoCHecked {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        try {
            c1.deposita();
        } catch(Exception ex) {  // Voce pode utiliar apenas a clase mae nos catchs ('Exception') assim voce criar um catch geral, que ira funcionar para todas as exceções.
            System.out.println("tratanto..");
        }
    }
}


// ao usar as exceçoes checked, voce obriga que ao utilizar uma função , ela obrigatoriamente pode ter uma exceção, e com isso voce avisa e obriga quem estiver chamando
// esse metodo de sua classe que ele precisa criar o tratamento desta exceção, seja usando o try-catch ou seja expecificando com o throws.