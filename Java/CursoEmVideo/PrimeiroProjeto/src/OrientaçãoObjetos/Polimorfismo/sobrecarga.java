// clase para exemplificar o polimorfismo de sobre carga


package OrientaçãoObjetos.Polimorfismo;

public class sobrecarga {
    public void reagir(String fala) {
        if(fala.equals("Ola") || fala.equals("Quem é o garoto?")) {
            System.out.println("Abana o rabo");
        } else {
            System.out.println("Rosna");
        }
    }

    public void reagir(int hora) {
        if (hora < 21) {
            System.out.println("Abanar rabo");
        } else {
            System.out.println("Ignora");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar rabo");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(float peso, int idade) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Pular e latir");
            } else {
                System.out.println("Latir");
            }
        } else {
            System.out.println("Ignorar");
        }
    }
}
