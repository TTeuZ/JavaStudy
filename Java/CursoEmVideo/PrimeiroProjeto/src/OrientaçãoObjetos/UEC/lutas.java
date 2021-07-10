package OrientaçãoObjetos.UEC;

public class lutas {
    public static void main(String[] args) {
        Combatente l[] = new Combatente[6];

        l[0] = new Combatente("Teste1", "Teste", 30, 1.78f, 60f, 10, 1, 4);
        l[1] = new Combatente("Teste2", "Teste", 30, 1.78f, 60f, 9, 2, 3);
        l[2] = new Combatente("Teste2", "Teste", 30, 1.78f, 85f, 10, 1, 4);
        l[3] = new Combatente("Teste3", "Teste", 30, 1.78f, 85f, 9, 2, 3);
        l[4] = new Combatente("Teste4", "Teste", 30, 1.78f, 100f, 10, 1, 4);
        l[5] = new Combatente("Teste5", "Teste", 30, 1.78f, 100f, 9, 2, 3);


        luta UEC01 = new luta();

        UEC01.marcarLuta(l[0], l[0]);
        UEC01.lutar();
    }
}
