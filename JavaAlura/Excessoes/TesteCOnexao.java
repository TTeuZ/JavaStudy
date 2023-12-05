package Excessoes;

public class TesteCOnexao {
    public static void main(String[] args) {
        // maneira simplificade de executar o codigo
        // para usar esse metodo, voce precisa implementar uma interface na classe conexao chamada AutoCloseable

        try(Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("erro de conexao.");
        }


        // ---------------------------------------------------------
        // maneira antiga, nao simplificada

        // Conexao con = null;
        // try {
        //     con = new Conexao();
        //     con.leDados();
        // } catch (Exception ex) {
        //     System.out.println("erro de conexao.");
        // } finally {  // sempre ira rodar no final do try
        //     if (con != null) {
        //         con.close();
        //     }
        // }
    }
}
