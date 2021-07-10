package OrientaçãoObjetos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cConta, nome, contaType, action, actionSelected, fecharConta;
        int i = 1;
        float dep, sac;

        System.out.println("!!!! Banco EOQpr !!!!");
        System.out.print("Você deseja abrir uma conta [S/N] ");
        cConta = teclado.nextLine().toUpperCase();

        if(cConta.equals("S")) {
            System.out.println("Qual o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Qual o tipo de conta voce quer abrir? [CP para conta poupança | CC para conta corrente]");
            contaType = teclado.next().toLowerCase();

            contaBanco conta = new contaBanco(i, nome, contaType);
            System.out.println("Conta criada com sucesso!");
            System.out.println("-----------------------------------------------------------------------------------------");
            conta.sobre();
            System.out.println("-----------------------------------------------------------------------------------------");

            do {
                action = "S";

                System.out.println("Qual ação voce deseja fazer?");
                System.out.println("Sobre [sobre]");
                System.out.println("Deposito [dep]");
                System.out.println("Sacar [sac]");
                System.out.println("Fechar conta [fechar]");
                System.out.println("Sair [sair]");
                actionSelected = teclado.next().toLowerCase();
                System.out.println(" ");

                if (actionSelected.equals("sobre")) {
                    System.out.println("-------------------------------------- SOBRE -------------------------------------");
                    conta.sobre();
                    System.out.println(" ");
                    System.out.println("--------------------------------------------------------------------------------------");
                } else if (actionSelected.equals("dep")) {
                    System.out.println("-------------------------------------- DEPOSITO -------------------------------------");
                    System.out.println("Quanto deseja depositar?");
                    dep = teclado.nextFloat();
                    conta.depositar(dep);
                    System.out.println("Deposito feito com sucesso!");
                    System.out.println(" ");
                    System.out.println("--------------------------------------------------------------------------------------");
                } else if (actionSelected.equals("sac")) {
                    System.out.println("-------------------------------------- SACAR -------------------------------------");
                    System.out.println("Quanto deseja sacar?");
                    sac = teclado.nextFloat();
                    conta.sacar(sac);
                    System.out.println("saque feito com sucesso!");
                    System.out.println(" ");
                    System.out.println("--------------------------------------------------------------------------------------");
                } else if (actionSelected.equals("fechar")) {
                    System.out.println("-------------------------------------- FECHAR CONTAR -------------------------------------");
                    System.out.println("deseja mesmo fechar a conta [S/N]");
                    fecharConta = teclado.next().toUpperCase();
                    if (fecharConta.equals("S")) {
                        conta.fecharConta();
                        System.out.println(" ");
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("Voltando a seleção de ações...");
                        action = "S";
                    }
                } else if (actionSelected.equals("sair")) {
                    System.out.println("Até mais");
                    action = "N";
                }


            } while(action.equals("S"));
        } else  {
            System.out.println("Muito obrigado! Tchau");
        }

    }
}