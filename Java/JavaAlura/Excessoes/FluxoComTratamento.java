package Excessoes;

public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (NullPointerException | ArithmeticException ex) { // podemos usar o '|' para expecificar diversas exceçoes em um unico try-catch
            String str = ex.getMessage();
            System.out.println(str);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo 1");
        metodo2();
        System.out.println("FIm do metodo 1");
    }
    private static void metodo2() {
        System.out.println("Ini do metodo 2");
        for(int i = 1; i <= 5;  i++) {
            System.out.println(i);

            // o metodo try sempre vai precisar de um catch, ou seja, quando voce tem alguma parte do codigo que voce acha que pode cair em uma excessao
            // voce o coloca no try{}, e para cada exceção que houer voce usa um catch, que ira rodar um codigo caso ocorra a exceção, nao interrompendo o laço
            // try {
            //     int a = i / 0;
            // } catch(ArithmeticException ex) {
            //     String str = ex.getMessage();
            //     System.out.println("ArithmeticException" + str);
            // }

            // Conta c = null;
            // c.deposita();
        }
        System.out.println("Fim do metodo 2");
    }
}
