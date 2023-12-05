package OrientaçãoObjetoAlura.Curso3.bank;

public class App {
    public static void main(String[] args) throws Exception{ // posso generalizar que o codigo inteiro pode retornar exeções usando esse 'throws Exception', so que desta maneira ele ainda ira travar o codigo, a unica maneira de nao travar o codigo é usaando o try-catch
        // POLIMORFISMO FUNCIONANDO
        // duas classes diferentes hendando conta, como na classe conta para fazer uma tranferencia ele usa o tipo generico (mae) 'Conta'
        // a tranferencia funciona entre conta corrente e conta poupança;

        Cliente jose = new Cliente("jose", "1231232312", "profissao");
        Cliente paulo = new Cliente("paulo", "1231232312", "profissao");

        ContaCorrente cc1 = new ContaCorrente(1111, 1111, jose);
        ContaPoupança cp1 = new ContaPoupança(1111, 1111, paulo);

        cc1.deposita(1000);
        cp1.deposita(2000);

        System.out.println("Saldo de jose: " + cc1.getSaldo());
        System.out.println("Saldo de paulo: " + cp1.getSaldo());
        
        try {  // para nao travar o codigo.
            cc1.transfere(1100, cp1);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("======================================================");
        

        System.out.println("Saldo de jose: " + cc1.getSaldo());
        System.out.println("Saldo de paulo: " + cp1.getSaldo());


        // SeguroVida seguro = new SeguroVida();

        CalculadoImposto calc = new CalculadoImposto();

        calc.registra(cc1);

        System.out.println(calc.getTotalImposto());

    }
}
