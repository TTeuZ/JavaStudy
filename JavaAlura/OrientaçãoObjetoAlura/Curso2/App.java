package OrientaçãoObjetoAlura.Curso2;

public class App {
    public static void main(String[] args) {
        Cliente p1 = new Cliente("Paulo", "123123", "teste");
        Cliente p2 = new Cliente("joao", "321312", "teste2");

        Conta c1 = new Conta(1111, 1, p1);
        Conta c2 = new Conta(2222, 2, p2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1.deposita(500);
        c2.deposita(400);
        c1.sacar(50);

        System.out.println(" ");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // c1.transfere(100, c2);

        // System.out.println(" ");

        // System.out.println(c1.toString());
        // System.out.println(c2.toString());
    }
}