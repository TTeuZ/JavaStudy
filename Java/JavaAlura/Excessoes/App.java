package Excessoes;

public class App {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (NullPointerException | ArithmeticException | MinhaExcecao | MinhaExcecaoChecked ex) { // podemos usar o '|' para expecificar diversas exceçoes em um unico try-catch
        // Como aqui eu possuo um try-catch, eu nao preciso especificar a exceção, ja que ela ja vai ser tratada pelo try-catch.
            String str = ex.getMessage();
            System.out.println(str);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecaoChecked{
        System.out.println("Ini do metodo 1");
        metodo2();
        System.out.println("FIm do metodo 1");
    }
    private static void metodo2() throws MinhaExcecaoChecked { // como essa 'MinhaExcecaoChecked' é uma exceçao que estende apenas Exception, ela priceisa ser especificado, por isso do 'throwns MinhaExcecaoChecked'
        System.out.println("Ini do metodo 2");

        
        // as exeçoes sao objetos, entao voce consegue instacialos
        // ArithmeticException exception = new ArithmeticException("ferro");
        // voce pode jogar esse objeto de exceção que voce criou com o 'throw' e neste momento ele trava o codigo.
        // throw exception;

        // throw new MinhaExcecao("DEU MUITO ERRADO"); //testando a exeção criada por mim
        throw new MinhaExcecaoChecked("deu errado pacas");

        // System.out.println("Fim do metodo 2");
    }
}
