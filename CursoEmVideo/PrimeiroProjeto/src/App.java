/*
import java.util.Scanner;

public class App {
    public static void main (final String[] args) {
        System.out.println("Solução de equações de segundao grau!");
        Scanner teclado = new Scanner(System.in);

        float a, b, c, delta, x1, x2;

        System.out.print("Digite o valor do numero acompanhado de X²: ");
        a = teclado.nextFloat();
        System.out.print("Digite o valor do numero que acompanha X: ");
        b = teclado.nextFloat();
        System.out.print("Digite o valor do numero isolado: ");
        c = teclado.nextFloat();

        delta = (float) (Math.pow(b,2) - (4 * a * c));

        if (delta < 0){
            System.out.println("O resultado nao existe nos numeros reais!");
        }
        else {
            x1= (float) (((-b) + Math.sqrt(delta)) / 2*a);
            x2= (float) (((-b) - Math.sqrt(delta)) / 2*a);
    
            System.out.printf("%.1fx² %.1fx %.1f: \n", a, b, c);
            System.out.printf("O delta é: %.1f \n", delta);
            System.out.printf("A primeira raiz é: %.1f \n", x1);
            System.out.printf("A segunda raiz é: %.1f \n", x2); 
        }
    }
}
*/